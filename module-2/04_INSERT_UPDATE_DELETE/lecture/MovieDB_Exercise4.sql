-- 1. Add a new person to the person table with the name "Lisa Byway" with the birthday of 4/15/1984 (1 row)
INSERT INTO person (person_name, birthday)
VALUES ('Lisa Byway', '4/15/1984');
-- 2. Add "Euclidean Pi" to the movie table. The overview is "The epic story of Euclid as a pizza delivery boy in ancient Greece" and was released 3/14/2015. Since its an epic, the run length is 3 hours and 14 minutes (194 minutes). (1 row)
INSERT INTO movie (title, overview, release_date, length_minutes)
VALUES ('Euclidean Pi', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '3/14/2015', 194);
-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)
INSERT INTO movie_actor (actor_id, movie_id)
VALUES ((SELECT person_id FROM person WHERE person_name = 'Eric Stoltz'), (SELECT movie_id FROM movie WHERE title = 'Back to the Future'));
-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
INSERT INTO genre (genre_name)
VALUES ('Sports');
INSERT INTO movie_genre (movie_id, genre_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Coach Carter'), (SELECT genre_id FROM genre WHERE genre_name = 'Sports'));
-- 5. The movie "Star Wars" was originally released by that name because it wasn't known if there would be a sequel. After the subsequent movies came out, it was retroactively re-titled "Star Wars: A New Hope".
-- Update the title in the movie table to "Star Wars: A New Hope" (1 row)
UPDATE movie
SET title = 'Star Wars: A New Hope'
WHERE title = 'Star Wars';
-- 6. For movies that are longer than 3 hours and 30 minutes (210 minutes), add the sentence "This is a long movie." to the end of the overview. (5 rows)
-- Note: The overviews end in a period with no trailing spaces. You'll need to also add a space before the new sentence.
UPDATE movie
SET overview = overview || ' ' || 'This is a long movie.'
WHERE length_minutes > 210;
-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.
DELETE FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Avengers: Infinity War');
-- 8. Remove "Penn Jillette" from the person table 
-- You'll have to remove data from another table before you can make him "disappear" (Get it? Because he's a magician...) (1 row each)
DELETE FROM movie_actor WHERE actor_id = (SELECT person_id FROM person WHERE person_name = 'Penn Jillette')
DELETE FROM person WHERE person_name = 'Penn Jillette';
-- 9. Remove "Memento" from the movie table
-- You'll have to remove data from two other tables before you can remove it (13 rows, 2 rows, 1 row)
DELETE FROM movie_actor WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Memento');
DELETE FROM movie_genre WHERE movie_id = (SELECT movie_id FROM movie WHERE title = 'Memento');
DELETE FROM movie WHERE title = 'Memento';
-- 10. For all people born before 1950 and have a home page, add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces. You'll need to also add a space before the website address.
UPDATE person
SET biography = biography || ' ' || home_page
WHERE birthday < '1/1/1950' AND home_page IS NOT NULL;
-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
INSERT INTO person (person_name)
VALUES ('Colton Baumgard');
UPDATE movie
SET director_id = (SELECT person_id FROM person WHERE person_name = 'Colton Baumgard')
WHERE title = 'The Blob';
-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)
INSERT INTO collection (collection_name)
VALUES ('Bill Murray Collection');
UPDATE movie
SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
WHERE (SELECT person_id FROM person WHERE person_name = 'Bill Murray') = (SELECT actor_id FROM movie_actor);

