-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre_name
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE title = 'The Wizard of Oz';

