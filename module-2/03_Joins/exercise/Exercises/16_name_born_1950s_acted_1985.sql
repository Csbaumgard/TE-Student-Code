-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT DISTINCT person_name, birthday
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE birthday BETWEEN '1/1/1950' AND '12/31/1959' AND release_date BETWEEN '1/1/1985' AND '12/31/1985';
