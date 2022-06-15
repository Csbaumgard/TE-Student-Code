-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person_name, birthday
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON person.person_id = movie_actor.actor_id
WHERE title = 'The Fifth Element';

