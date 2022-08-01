<template>
    <div>
    <a
      id="show-form-button"
      href="#"
      v-show="!showForm"
      v-on:click.prevent="showForm = true"
      >Show Form</a>

      <form class="new-book-form" v-on:submit.prevent="addNewBook">
          <div class="title-input">
              <label for="title"> Title: </label>
              <input id="title" type="text" v-model="newBook.title" required>
          </div>
          <div class="author-input">
              <label for="author">Author: </label>
              <input id="author" type="text" v-model="newBook.author" required>
          </div>
          <div class="isbn-input">
              <label for="isbn">ISBN: </label>
              <input id="isbn" type="text" v-model="newBook.isbn" required>
          </div>
          <input type="submit" value="Save">
          <input type="button" value="Cancel" v-on:click="resetForm">
      </form>
    </div>
</template>

<script>
export default {
  name: "add-book",
  data() {
    return {
      newBook: {},
    };
  },
  methods: {
    addNewBook() {
      // mutate the store to add the new review
      this.$store.commit('ADD_BOOK', this.newBook);
      this.resetForm();
    },
    resetForm() {
      this.newBook = {};
    },
  },
};
</script>

<style>
div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input,
div.form-element > select {
  height: 30px;
  width: 300px;
}
div.form-element > textarea {
  height: 60px;
  width: 300px;
}
form > input[type="button"] {
  width: 100px;
}
form > input[type="submit"] {
  width: 100px;
  margin-right: 10px;
}
</style>