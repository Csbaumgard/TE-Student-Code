import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue';
import MyBooks from '../views/MyBooks.vue';
import NewBook from '../views/NewBook.vue';

Vue.use(VueRouter);

const routes = [
  {
    name: 'Home',
    path: '/',
    component: Home
  },
  {
    name: 'MyBooks',
    path: '/myBooks/',
    component: MyBooks
  },
  {
    name: 'NewBook',
    path: '/addBook/',
    component: NewBook
  }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
