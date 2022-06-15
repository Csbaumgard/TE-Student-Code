-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT person_name, title
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON person.person_id = movie_actor.actor_id
WHERE person_name LIKE '% Jones'
ORDER BY person_name ASC;
