<template>
  <ul>
      <li v-for="item in shoppingList.items" v-bind:key="item"> {{ item }} </li>
  </ul>
</template>

<script>
import shoppingListService from '@/services/ShoppingListService.js'

export default {
    
    created() {
        shoppingListService.getShoppingList().then(response => {
            this.shoppingList = response.data;
        })
    },

    data() {
        return {
            shoppingList: {}
        }
    }

}
</script>

<style>

</style>