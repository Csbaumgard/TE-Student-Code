-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT DISTINCT person_name
FROM movie
JOIN collection USING (collection_id)
JOIN person ON person_id = director_id
WHERE collection_name = 'Harry Potter Collection';
