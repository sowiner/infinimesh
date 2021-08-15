// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avrorepo.proto

package main.java.proto;

/**
 * Protobuf type {@code proto.SaveDeviceStateRequest}
 */
public final class SaveDeviceStateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.SaveDeviceStateRequest)
    SaveDeviceStateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveDeviceStateRequest.newBuilder() to construct.
  private SaveDeviceStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveDeviceStateRequest() {
    deviceId_ = "";
    namespaceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveDeviceStateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SaveDeviceStateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            namespaceId_ = s;
            break;
          }
          case 24: {

            version_ = input.readUInt64();
            break;
          }
          case 34: {
            main.java.proto.DeviceState.Builder subBuilder = null;
            if (ds_ != null) {
              subBuilder = ds_.toBuilder();
            }
            ds_ = input.readMessage(main.java.proto.DeviceState.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ds_);
              ds_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return main.java.proto.avrorepo.internal_static_proto_SaveDeviceStateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return main.java.proto.avrorepo.internal_static_proto_SaveDeviceStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            main.java.proto.SaveDeviceStateRequest.class, main.java.proto.SaveDeviceStateRequest.Builder.class);
  }

  public static final int DEVICEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object deviceId_;
  /**
   * <code>string deviceId = 1;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string deviceId = 1;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object namespaceId_;
  /**
   * <code>string namespaceId = 2;</code>
   * @return The namespaceId.
   */
  @java.lang.Override
  public java.lang.String getNamespaceId() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespaceId_ = s;
      return s;
    }
  }
  /**
   * <code>string namespaceId = 2;</code>
   * @return The bytes for namespaceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceIdBytes() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespaceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private long version_;
  /**
   * <code>uint64 version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int DS_FIELD_NUMBER = 4;
  private main.java.proto.DeviceState ds_;
  /**
   * <code>.proto.DeviceState ds = 4;</code>
   * @return Whether the ds field is set.
   */
  @java.lang.Override
  public boolean hasDs() {
    return ds_ != null;
  }
  /**
   * <code>.proto.DeviceState ds = 4;</code>
   * @return The ds.
   */
  @java.lang.Override
  public main.java.proto.DeviceState getDs() {
    return ds_ == null ? main.java.proto.DeviceState.getDefaultInstance() : ds_;
  }
  /**
   * <code>.proto.DeviceState ds = 4;</code>
   */
  @java.lang.Override
  public main.java.proto.DeviceStateOrBuilder getDsOrBuilder() {
    return getDs();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDeviceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceId_);
    }
    if (!getNamespaceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namespaceId_);
    }
    if (version_ != 0L) {
      output.writeUInt64(3, version_);
    }
    if (ds_ != null) {
      output.writeMessage(4, getDs());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeviceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceId_);
    }
    if (!getNamespaceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namespaceId_);
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, version_);
    }
    if (ds_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDs());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof main.java.proto.SaveDeviceStateRequest)) {
      return super.equals(obj);
    }
    main.java.proto.SaveDeviceStateRequest other = (main.java.proto.SaveDeviceStateRequest) obj;

    if (!getDeviceId()
        .equals(other.getDeviceId())) return false;
    if (!getNamespaceId()
        .equals(other.getNamespaceId())) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (hasDs() != other.hasDs()) return false;
    if (hasDs()) {
      if (!getDs()
          .equals(other.getDs())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (37 * hash) + NAMESPACEID_FIELD_NUMBER;
    hash = (53 * hash) + getNamespaceId().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    if (hasDs()) {
      hash = (37 * hash) + DS_FIELD_NUMBER;
      hash = (53 * hash) + getDs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static main.java.proto.SaveDeviceStateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static main.java.proto.SaveDeviceStateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static main.java.proto.SaveDeviceStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(main.java.proto.SaveDeviceStateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.SaveDeviceStateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.SaveDeviceStateRequest)
      main.java.proto.SaveDeviceStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return main.java.proto.avrorepo.internal_static_proto_SaveDeviceStateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return main.java.proto.avrorepo.internal_static_proto_SaveDeviceStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              main.java.proto.SaveDeviceStateRequest.class, main.java.proto.SaveDeviceStateRequest.Builder.class);
    }

    // Construct using main.java.proto.SaveDeviceStateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      deviceId_ = "";

      namespaceId_ = "";

      version_ = 0L;

      if (dsBuilder_ == null) {
        ds_ = null;
      } else {
        ds_ = null;
        dsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return main.java.proto.avrorepo.internal_static_proto_SaveDeviceStateRequest_descriptor;
    }

    @java.lang.Override
    public main.java.proto.SaveDeviceStateRequest getDefaultInstanceForType() {
      return main.java.proto.SaveDeviceStateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public main.java.proto.SaveDeviceStateRequest build() {
      main.java.proto.SaveDeviceStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public main.java.proto.SaveDeviceStateRequest buildPartial() {
      main.java.proto.SaveDeviceStateRequest result = new main.java.proto.SaveDeviceStateRequest(this);
      result.deviceId_ = deviceId_;
      result.namespaceId_ = namespaceId_;
      result.version_ = version_;
      if (dsBuilder_ == null) {
        result.ds_ = ds_;
      } else {
        result.ds_ = dsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof main.java.proto.SaveDeviceStateRequest) {
        return mergeFrom((main.java.proto.SaveDeviceStateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(main.java.proto.SaveDeviceStateRequest other) {
      if (other == main.java.proto.SaveDeviceStateRequest.getDefaultInstance()) return this;
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        onChanged();
      }
      if (!other.getNamespaceId().isEmpty()) {
        namespaceId_ = other.namespaceId_;
        onChanged();
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.hasDs()) {
        mergeDs(other.getDs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      main.java.proto.SaveDeviceStateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (main.java.proto.SaveDeviceStateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deviceId_ = "";
    /**
     * <code>string deviceId = 1;</code>
     * @return The deviceId.
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deviceId = 1;</code>
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deviceId = 1;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deviceId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      
      deviceId_ = getDefaultInstance().getDeviceId();
      onChanged();
      return this;
    }
    /**
     * <code>string deviceId = 1;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object namespaceId_ = "";
    /**
     * <code>string namespaceId = 2;</code>
     * @return The namespaceId.
     */
    public java.lang.String getNamespaceId() {
      java.lang.Object ref = namespaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespaceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namespaceId = 2;</code>
     * @return The bytes for namespaceId.
     */
    public com.google.protobuf.ByteString
        getNamespaceIdBytes() {
      java.lang.Object ref = namespaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespaceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namespaceId = 2;</code>
     * @param value The namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespaceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namespaceId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespaceId() {
      
      namespaceId_ = getDefaultInstance().getNamespaceId();
      onChanged();
      return this;
    }
    /**
     * <code>string namespaceId = 2;</code>
     * @param value The bytes for namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespaceId_ = value;
      onChanged();
      return this;
    }

    private long version_ ;
    /**
     * <code>uint64 version = 3;</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     * <code>uint64 version = 3;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0L;
      onChanged();
      return this;
    }

    private main.java.proto.DeviceState ds_;
    private com.google.protobuf.SingleFieldBuilderV3<
        main.java.proto.DeviceState, main.java.proto.DeviceState.Builder, main.java.proto.DeviceStateOrBuilder> dsBuilder_;
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     * @return Whether the ds field is set.
     */
    public boolean hasDs() {
      return dsBuilder_ != null || ds_ != null;
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     * @return The ds.
     */
    public main.java.proto.DeviceState getDs() {
      if (dsBuilder_ == null) {
        return ds_ == null ? main.java.proto.DeviceState.getDefaultInstance() : ds_;
      } else {
        return dsBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public Builder setDs(main.java.proto.DeviceState value) {
      if (dsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ds_ = value;
        onChanged();
      } else {
        dsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public Builder setDs(
        main.java.proto.DeviceState.Builder builderForValue) {
      if (dsBuilder_ == null) {
        ds_ = builderForValue.build();
        onChanged();
      } else {
        dsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public Builder mergeDs(main.java.proto.DeviceState value) {
      if (dsBuilder_ == null) {
        if (ds_ != null) {
          ds_ =
            main.java.proto.DeviceState.newBuilder(ds_).mergeFrom(value).buildPartial();
        } else {
          ds_ = value;
        }
        onChanged();
      } else {
        dsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public Builder clearDs() {
      if (dsBuilder_ == null) {
        ds_ = null;
        onChanged();
      } else {
        ds_ = null;
        dsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public main.java.proto.DeviceState.Builder getDsBuilder() {
      
      onChanged();
      return getDsFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    public main.java.proto.DeviceStateOrBuilder getDsOrBuilder() {
      if (dsBuilder_ != null) {
        return dsBuilder_.getMessageOrBuilder();
      } else {
        return ds_ == null ?
            main.java.proto.DeviceState.getDefaultInstance() : ds_;
      }
    }
    /**
     * <code>.proto.DeviceState ds = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        main.java.proto.DeviceState, main.java.proto.DeviceState.Builder, main.java.proto.DeviceStateOrBuilder> 
        getDsFieldBuilder() {
      if (dsBuilder_ == null) {
        dsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            main.java.proto.DeviceState, main.java.proto.DeviceState.Builder, main.java.proto.DeviceStateOrBuilder>(
                getDs(),
                getParentForChildren(),
                isClean());
        ds_ = null;
      }
      return dsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.SaveDeviceStateRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.SaveDeviceStateRequest)
  private static final main.java.proto.SaveDeviceStateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new main.java.proto.SaveDeviceStateRequest();
  }

  public static main.java.proto.SaveDeviceStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveDeviceStateRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveDeviceStateRequest>() {
    @java.lang.Override
    public SaveDeviceStateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SaveDeviceStateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveDeviceStateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveDeviceStateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public main.java.proto.SaveDeviceStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
