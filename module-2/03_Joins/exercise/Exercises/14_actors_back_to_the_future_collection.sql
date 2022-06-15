-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT DISTINCT person_name
FROM movie
JOIN collection USING (collection_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE collection_name = 'Back to the Future Collection';
