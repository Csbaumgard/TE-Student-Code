-- 1. The name and population of all cities in Ohio (OH) (6 rows)
SELECT city_name, population FROM CITY WHERE state_abbreviation = 'OH';
-- 2. The name and area of all cities in Pennsylvania (PA) (4 rows)
SELECT city_name, area FROM city WHERE state_abbreviation = 'PA';
-- 3. The name, population, and sales tax of the states in the "West" census region (13 rows)
SELECT state_name, population, sales_tax FROM state WHERE census_region = 'West';
-- 4. The name, population, and nickname of the states in the "Northeast" census region (9 rows)
SELECT state_name, population, state_nickname FROM state WHERE census_region = 'Northeast';
-- 5. The name, state abbreviation, and population of cities with a population greater than 1,000,000 people (10 rows)
SELECT city_name, state_abbreviation, population FROM city WHERE population > 1000000;
-- 6. The name, abbreviation, population, and area of states with an area greater than 200,000 square kilometers (16 rows)
SELECT state_name, state_abbreviation, population, area FROM state WHERE area > 200000;
-- 7. The name, date established, and area of parks with an area less than 100 square kilometers (6 rows)
SELECT park_name, date_established, area FROM park WHERE area < 100;
-- 8. The name and population of cities in California (CA) with a population less than 150,000 people (37 rows)
SELECT city_name, population FROM city WHERE state_abbreviation = 'CA' AND population < 150000;
-- 9. The name, abbreviation, population, and sales tax of all states and territories with a sales tax greater than 6.6% (9 rows)
SELECT state_name, state_abbreviation, population, sales_tax FROM state WHERE sales_tax > 6.6;
-- 10. The name and area of parks that have an area less than or equal to 700 square kilometers and provides camping (21 rows)
SELECT park_name, area FROM park WHERE area <= 700 AND has_camping = 'true';
-- 11. The name, state, and population of all cities in Colorado (CO) or Arizona (AZ) (22 rows)
SELECT city_name, state_abbreviation, population FROM city WHERE state_abbreviation = 'CO' OR state_abbreviation = 'AZ';
-- 12. The state name, nickname, and sales tax from records in the state table in the "West" and "South" census regions with a sales tax that isn't 0% (26 rows)
SELECT state_name, state_nickname, sales_tax FROM state WHERE sales_tax <> 0 AND census_region = 'South' AND census_region = 'West';
-- 13. The name, abbreviation, and population of all records in the state table with no official nickname (NULL) (5 rows)
SELECT state_name, state_abbreviation, population FROM state WHERE state_nickname IS NULL;
-- 14. The state name, nickname, and census region for states that start with the word "New" (4 rows)
SELECT state_name, state_nickname, census_region FROM state WHERE state_name LIKE 'New %';
-- 15. The name, state abbreviation, and population for cities that end with the word "City" (11 rows)
SELECT city_name, state_abbreviation, population FROM city WHERE city_name LIKE '% City';
-- 16. The name, date established, and area of parks that contain the string "Canyon" anywhere in the name (5 rows)
SELECT park_name, date_established, area FROM park WHERE park_name LIKE '%Canyon%';
-- 17. The name, population, and area of all records in the state table with no census region (NULL) and area less than 5000 square kilometers (3 rows)
SELECT state_name, population, area FROM state WHERE census_region IS NULL AND area < 5000;
-- 18. The name, population, and sales tax of all records in the state table with a sales tax of at least 7% or have a population of less than 1,000,000 (17 rows)
SELECT state_name, population, sales_tax FROM state WHERE sales_tax >= 7 OR population < 1000000;
-- 19. The name, population, area, and population density (name the column 'population_density') of all states, territories, and districts (56 rows)
SELECT state_name, population, area, population/area AS population_density FROM state;
-- 20. The name, population, area, and population density (name the column 'population_density') of states, territories, and districts with more than 100 people per square kilometer (12 rows)
SELECT state_name, population, area, population/area AS population_density FROM state WHERE population / area > 100;
-- 21. The name and nickname for all records in the state table with no official nickname (NULL) or nickname starts with the word "The" (13 rows)
SELECT state_name, state_nickname FROM state WHERE state_nickname IS NULL OR state_nickname LIKE 'The %';
-- 22. The name and sales tax for states and territories with sales tax greater than or equal to 2% and less than or equal to 5% (15 rows)
SELECT state_name, sales_tax FROM state WHERE sales_tax BETWEEN 2 AND 5;
-- 23. The name and date established of parks opened in the 1960s (6 rows)
SELECT park_name, date_established FROM park WHERE date_established BETWEEN '1/1/1960' AND '12/31/1969';
