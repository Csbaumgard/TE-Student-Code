-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT DISTINCT genre_name
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE person_name = 'Christopher Lloyd';
