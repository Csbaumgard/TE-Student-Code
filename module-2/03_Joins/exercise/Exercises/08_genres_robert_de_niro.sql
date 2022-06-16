-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT genre_name
FROM movie
INNER JOIN movie_genre USING (movie_id)
INNER JOIN genre USING (genre_id)
INNER JOIN movie_actor USING (movie_id)
INNER JOIN person ON actor_id = person_id
WHERE person_name = 'Robert De Niro' AND release_date BETWEEN '1/1/2010' AND '6/15/2022'
ORDER BY genre_name DESC;



