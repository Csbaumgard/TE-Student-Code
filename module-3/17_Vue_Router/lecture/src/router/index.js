import Vue from 'vue'
import VueRouter from 'vue-router'
import ProductsList from '../views/ProductsList.vue'
import ProductDetail from '../views/ProductDetail.vue'

Vue.use(VueRouter)

const routes = [
  {
    name: 'products',
    path: '/',
    component: ProductsList
  }, 
  {
    path: '/products/:id',
    component: ProductDetail
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
