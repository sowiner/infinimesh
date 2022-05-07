/*
Copyright © 2021-2022 Infinite Devices GmbH, Nikita Ivanovski info@slnt-opp.xyz

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package graph

import (
	"context"

	"github.com/arangodb/go-driver"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"

	"github.com/infinimesh/infinimesh/pkg/graph/schema"
	pb "github.com/infinimesh/infinimesh/pkg/node/proto"
	accpb "github.com/infinimesh/infinimesh/pkg/node/proto/accounts"
	inf "github.com/infinimesh/infinimesh/pkg/shared"
	"go.uber.org/zap"

	"github.com/infinimesh/infinimesh/pkg/node/proto/access"
	nspb "github.com/infinimesh/infinimesh/pkg/node/proto/namespaces"
)
type Namespace struct {
	*nspb.Namespace
	driver.DocumentMeta
}

func (o *Namespace) ID() (driver.DocumentID) {
	return o.DocumentMeta.ID
}

func (o *Namespace) SetAccessLevel(level access.AccessLevel) {
	if o.Access == nil {
		o.Access = &access.Access{
			Level: level,
		}
		return
	}
	o.Access.Level = level
}

func NewBlankNamespaceDocument(key string) *Namespace {
	return &Namespace{
		Namespace: &nspb.Namespace{
			Uuid: key,
		},
		DocumentMeta: NewBlankDocument(schema.NAMESPACES_COL, key),
	}
}

type NamespacesController struct {
	pb.UnimplementedNamespacesServiceServer
	log *zap.Logger

	col driver.Collection // Namespaces Collection
	acc2ns driver.Collection // Accounts to Namespaces permissions edge collection
	ns2acc driver.Collection // Namespaces to Accounts permissions edge collection

	db driver.Database
}

func NewNamespacesController(log *zap.Logger, db driver.Database) *NamespacesController {
	ctx := context.TODO()
	col, _ := db.Collection(ctx, schema.NAMESPACES_COL)
	return &NamespacesController{
		log: log.Named("NamespacesController"), col: col, db: db,
		acc2ns: GetEdgeCol(ctx, db, schema.ACC2NS), ns2acc: GetEdgeCol(ctx, db, schema.NS2ACC),
	}
}

func (c *NamespacesController) Create(ctx context.Context, request *nspb.Namespace) (*nspb.Namespace, error) {
	log := c.log.Named("Create")
	log.Debug("Create request received", zap.Any("request", request), zap.Any("context", ctx))

	requestor := ctx.Value(inf.InfinimeshAccountCtxKey).(string)
	log.Debug("Requestor", zap.String("id", requestor))

	namespace := Namespace{Namespace: request}
	meta, err := c.col.CreateDocument(ctx, namespace)
	if err != nil {
		log.Error("Error creating namespace", zap.Error(err))
		return nil, status.Error(codes.Internal, "Error while creating namespace")
	}
	namespace.Uuid = meta.ID.Key()
	namespace.DocumentMeta = meta

	requestorAcc := NewBlankAccountDocument(requestor)
	err = Link(ctx, log, c.acc2ns,
		requestorAcc,
		&namespace, access.AccessLevel_ADMIN, access.Role_OWNER,
	)
	if err != nil {
		log.Error("Error creating edge", zap.Error(err))
		c.col.RemoveDocument(ctx, namespace.Uuid)
		return nil, status.Error(codes.Internal, "error creating Permission")
	}

	return namespace.Namespace, nil
}

func (c *NamespacesController) List(ctx context.Context, _ *pb.EmptyMessage) (*nspb.Namespaces, error) {
	log := c.log.Named("List")

	requestor := ctx.Value(inf.InfinimeshAccountCtxKey).(string)
	log.Debug("Requestor", zap.String("id", requestor))

	cr, err := ListQuery(ctx, log, c.db, NewBlankAccountDocument(requestor), schema.NAMESPACES_COL, 4)
	if err != nil {
		return nil, err
	}
	defer cr.Close()

	var r []*nspb.Namespace
	for {
		var ns nspb.Namespace 
		_, err := cr.ReadDocument(ctx, &ns)
		if driver.IsNoMoreDocuments(err) {
			break
		} else if err != nil {
			return nil, err
		}
		log.Debug("Got document", zap.Any("namespace", &ns))
		r = append(r, &ns)
	}

	return &nspb.Namespaces{
		Namespaces: r,
	}, nil
}

const listJoinsQuery = `
FOR node, edge, path IN 1 INBOUND @namespace
GRAPH Permissions
FILTER edge.role != 1 && edge.level > 0
RETURN MERGE(node, { uuid: node._key, access: { level: edge.level } })
`
func (c *NamespacesController) Joins(ctx context.Context, request *nspb.Namespace) (*accpb.Accounts, error) {
	log := c.log.Named("Joins")

	requestor := ctx.Value(inf.InfinimeshAccountCtxKey).(string)
	log.Debug("Requestor", zap.String("id", requestor))

	ns := *NewBlankNamespaceDocument(request.GetUuid())
	err := AccessLevelAndGet(ctx, log, c.db, NewBlankAccountDocument(requestor), &ns)
	if err != nil {
		log.Error("Error getting Namespace and access level", zap.Error(err))
		return nil, status.Error(codes.NotFound, "Namespace not found or not enough Access Rights")
	}

	if ns.Access.Level < access.AccessLevel_ADMIN {
		return nil, status.Error(codes.PermissionDenied, "Not enough Access Rights")
	}

	cr, err := c.db.Query(ctx, listJoinsQuery, map[string]interface{}{
		"namespace": ns.ID(),
	})
	if err != nil {
		log.Error("Error querying for joins", zap.Error(err))
		return nil, status.Error(codes.Internal, "Error querying for joins")
	}
	defer cr.Close()

	var r []*accpb.Account
	for {
		var acc accpb.Account
		_, err := cr.ReadDocument(ctx, &acc)
		if driver.IsNoMoreDocuments(err) {
			break
		} else if err != nil {
			log.Error("Error unmarshalling Document", zap.Error(err))
			return nil, status.Error(codes.Internal, "Couldn't execute query")
		}
		log.Debug("Got document", zap.Any("account", &acc))
		r = append(r, &acc)
	}

	return &accpb.Accounts{Accounts: r}, nil
}