<template>
  <div id="app">
    <Topnav />
    <router-view />
  </div>
</template>

<script>
import Topnav from './components/Topnav.vue'

export default {
  name: 'App',
  components: {
    Topnav,
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
