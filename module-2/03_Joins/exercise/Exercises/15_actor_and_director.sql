-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT title, person_name
FROM movie
JOIN person ON person_id = director_id
JOIN movie_actor USING (movie_id)
WHERE director_id = actor_id;
