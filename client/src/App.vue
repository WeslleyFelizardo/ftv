<template>
  <div id="q-app">

    <form-user></form-user>
    <router-view />
  </div>
</template>

<script>
import formUser from './components/form-user.vue'

export default {
  name: 'App',
  components: { formUser }
}
</script>

<style>
</style>
