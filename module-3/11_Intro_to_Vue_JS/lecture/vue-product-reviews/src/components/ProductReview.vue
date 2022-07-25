<template>
  <main>
      <h2>Product Reviews for {{ name }}</h2>
      <p class="description">{{ description }}</p>

      <div class="review">
          <h4></h4>
          <div class="rating"></div>
          <h3></h3>
          <p></p>
      </div>
  </main>
</template>

<script>
export default {
    data() {
        return{
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all your squirrelly friends.',
            reviews: [
                {
                    id: 1,
                    title: 'What a book!',
                    reviewer: 'Malcolm Gladwell',
                    rating: 3,
                    review: 'It certainly is a book. I mean, I can see that.'
                }
            ]
        }
    }
};
</script>

<style scoped>

main.main {
    margin: 1rem 0;
}

</style>