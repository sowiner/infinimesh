<template>
  <n-dropdown :options="options">
    <n-button>
      <template #icon>
        <n-icon>
          <Person />
        </n-icon>
      </template>
      {{ me.title }}
    </n-button>
  </n-dropdown>

  <set-credentials-modal :show="show" @close="show = false" :account="me" />
</template>

<script setup>
import { ref, watch } from "vue";
import { storeToRefs } from "pinia";
import { NButton, NDropdown, NIcon } from "naive-ui";
import { renderIcon } from "@/utils";
import { Person, LogOutOutline, LockClosedOutline, CodeSlashOutline } from "@vicons/ionicons5";
import { useAppStore } from "@/store/app";
import { useRouter } from "vue-router";

import setCredentialsModal from "@/components/accounts/set-credentials-modal.vue";

const router = useRouter();
const store = useAppStore();

const { me, dev } = storeToRefs(store);

const show = ref(false)

const options = ref([
  {
    key: "credentials",
    label: "Manage Credentials",
    icon: renderIcon(LockClosedOutline),
    props: {
      onClick: () => {
        show.value = true;
      },
    },
  },
  {
    type: 'divider',
    key: 'd1'
  },
  {
    key: "logout",
    label: "Logout",
    icon: renderIcon(LogOutOutline),
    props: {
      onClick: () => {
        store.logout();
        router.push({ name: "Login" });
      },
    },
  }
]);

function addNoDev() {
  if (dev.value) {
    options.value.splice(1, 0, {
      key: "nodev",
      label: "Turn off Develeper Mode",
      icon: renderIcon(CodeSlashOutline),
      props: {
        onClick: () => {
          dev.value = false
          options.value.splice(1, 1)
        }
      }
    })
  }
}
watch(dev, addNoDev)
addNoDev()
</script>