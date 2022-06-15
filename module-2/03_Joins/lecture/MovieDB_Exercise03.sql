-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT title, release_date
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON person.person_id = movie_actor.actor_id
WHERE person_name = 'Tom Hanks'
-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person_name, birthday
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON person.person_id = movie_actor.actor_id
WHERE title = 'The Fifth Element';
-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT person_name, title
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON person.person_id = movie_actor.actor_id
WHERE person_name LIKE '% Jones'
ORDER BY person_name ASC;
-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
SELECT title, tagline
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE genre_name = 'Fantasy'
ORDER BY title ASC;
-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)
SELECT title, release_date
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE genre_name = 'Comedy'
ORDER BY release_date ASC;
-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre_name
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE title = 'The Wizard of Oz';
-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT DISTINCT genre_name
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE person_name = 'Christopher Lloyd';
-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT genre_name
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE person_name = 'Robert De Niro' AND release_date BETWEEN '1/1/2010' AND '6/15/2022';
-- 9. The titles of movies directed by James Cameron (6 rows)
SELECT title
FROM movie
JOIN person ON person_id = director_id
WHERE person_name = 'James Cameron';
-- 10. The names of directors who have directed a movie over 3 hours [180 minutes] (15 rows)
SELECT DISTINCT person_name
FROM movie
JOIN person ON person_id = director_id
WHERE length_minutes > 180;
-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)
SELECT title
FROM movie
JOIN collection USING (collection_id)
WHERE collection_name = 'Star Wars Collection'
ORDER BY release_date DESC;
-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT title
FROM movie
JOIN collection USING (collection_id)
JOIN person ON person_id = director_id
WHERE collection_name = 'Star Wars Collection' AND person_name != 'George Lucas';
-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT DISTINCT person_name
FROM movie
JOIN collection USING (collection_id)
JOIN person ON person_id = director_id
WHERE collection_name = 'Harry Potter Collection';
-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT DISTINCT person_name
FROM movie
JOIN collection USING (collection_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE collection_name = 'Back to the Future Collection';
-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT title, person_name
FROM movie
JOIN person ON person_id = director_id
JOIN movie_actor USING (movie_id)
WHERE director_id = actor_id;
-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT DISTINCT person_name, birthday
FROM movie
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE birthday BETWEEN '1/1/1950' AND '12/31/1959' AND release_date BETWEEN '1/1/1985' AND '12/31/1985';
-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)
SELECT title, tagline
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
JOIN movie_actor USING (movie_id)
JOIN person ON actor_id = person_id
WHERE genre_name = 'Family' AND person_name = 'Samuel L. Jackson';
-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result around 110-120)
SELECT AVG(length_minutes) AS average_length
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE genre_name = 'Science Fiction';
-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'. 
-- (19 rows, expected result for Action is around 180).
SELECT genre_name, COUNT(movie_id) AS num_of_movies
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
GROUP BY genre_name;
-- 20. The titles, lengths, and release dates of the 5 longest movies in the "Action" genre. Order the movies by length (highest first), then by release date (latest first).
-- (5 rows, expected lengths around 180 - 200)
SELECT title, length_minutes, release_date
FROM movie
JOIN movie_genre USING (movie_id)
JOIN genre USING (genre_id)
WHERE genre_name = 'Action'
ORDER BY length_minutes DESC, release_date DESC
LIMIT 5;
-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT person_name, COUNT(title) AS num_of_movies
FROM movie
JOIN movie_actor USING (movie_id)
RIGHT JOIN person ON actor_id = person_id
WHERE person_name LIKE 'George %'
GROUP BY person_name
ORDER BY person_name ASC;
