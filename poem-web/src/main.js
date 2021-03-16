import Vue from 'vue'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.min.css'
import VueRouter from 'vue-router'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import MainPage from './components/MainPage'
import UserProfile from './components/UserProfile'

Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)
Vue.use(VueRouter)

const router = new VueRouter({
  routes: [
    { path: '/main', component: MainPage },
    { path: '/user/profile', component: UserProfile },
    { path: '*', redirect: '/main' },
  ],
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
