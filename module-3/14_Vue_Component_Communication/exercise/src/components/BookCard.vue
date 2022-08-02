<template>
  <div class="card" v-bind:class="{ read: book.read }" v-bind:key="book.title">
    <h2 class="book-title"> {{ book.title }} </h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3 class="book-author"> {{ book.author }} </h3>
    <input type="button" value="Mark Read" class="read" v-bind:click="book.read" v-on:click="toggleRead">
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ['book'],
    methods: {
        toggleRead() {
            if (!this.read) {
                const toggleRead = document.querySelector('.read');
                this.$store.commit('FLIP_READ', this.book);
                toggleRead.classList.add('mark-unread');
                toggleRead.classList.remove('mark-read');
                this.value == 'Mark Unread';
                
            } else {
                const toggleRead = document.querySelector('.read');
                this.$store.commit('FLIP_READ', this.book);
                toggleRead.classList.add('mark-read');
                toggleRead.classList.remove('mark-unread');
                this.value == 'Mark Read';
            }
            
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>