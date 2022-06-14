-- 1. The city name, state abbreviation, and population of all cities in the states that border Ohio.
-- The states are: Pennsylvania (PA), West Virginia (WV), Kentucky (KY), Indiana (IN), and Michigan (MI).
-- The city name and state abbreviation should be returned as a single column called 'name_and_state' and should contain values such as "Detroit, MI".
-- Order the results alphabetically by state abbreviation and then by city name.
-- (20 rows)
SELECT city_name || ', ' || state_abbreviation AS name_and_state, population
FROM city
WHERE state_abbreviation IN ('PA', 'WV', 'KY', 'IN', 'MI')
ORDER BY state_abbreviation, city_name;
-- 2. The name and nickname of all states and territories that have a nickname (not NULL).
-- The name and nickname should be returned as a single column named 'state_and_nickname' and should contain values such as "New Jersey (Garden State)".
-- Order the results alphabetically by nickname.
-- (51 rows)
SELECT state_name || ' (' || state_nickname || ')' AS state_and_nickname
FROM state
WHERE state_nickname IS NOT NULL
ORDER BY state_nickname ASC;
-- 3. The name, population, area, and population density (name the column 'population_density') of cities with more than 5,000 people per square kilometer.
-- Population density is expressed as people per square kilometer. In other words, population divided by area.
-- Order the results by population density, highest number first.
-- (9 rows)
SELECT city_name, population, area, population/area AS population_density
FROM city
WHERE population/area > 5000
ORDER BY population_density DESC;
-- 4. The average population of states in the "West" census region. Name the column 'average_population'.
-- Expected answer is around 6,000,000
-- (1 row)
SELECT AVG(population) AS average_population
FROM state
WHERE census_region = 'West';
-- 5. The sum of the population of all cities in California. Name the column 'california_population'.
-- Expected answer is around 20,000,000
-- (1 row)
SELECT SUM(population) AS california_population
FROM city
WHERE state_abbreviation = 'CA';
-- 6. The sum of the population of all states in the "South" census region. Name the column 'south_population'.
-- Expected answer is around 125,000,000
-- (1 row)
SELECT SUM(population) AS south_population
FROM state
WHERE census_region = 'South';
-- 7. The population of the state with the highest population. Name the column 'largest_state_population'.
-- Expected answer is around 39,500,000
-- (1 row)
SELECT Max(population) AS largest_state_population
FROM state;
-- 8. The area of the smallest state in the "Northeast" census region. Name the column 'smallest_northeast_area'.
-- Expected answer is around 4,000
-- (1 row)
SELECT MIN(area) AS smallest_northeast_area
FROM state
WHERE census_region = 'Northeast';
-- 9. The population of the city with the highest population. Name the column 'largest_city_population'.
-- Expected answer is around 8,300,000
-- (1 row)
SELECT MAX(population) AS largest_city_population
FROM city;
-- 10. The population of the city with the smallest population in Oregon (OR). Name the column 'smallest_oregon_population'.
-- Expected answer is around 100,000
-- (1 row)
SELECT MIN(population) AS smallest_oregon_city
FROM city
WHERE state_abbreviation = 'OR';
-- 11. The average sales tax of all states, territories, and districts. Name the column 'average_sales_tax'.
-- Expected answer is around 4.9%
-- (1 row)
SELECT AVG(sales_tax) AS average_sales_tax
FROM state;
-- 12. The average population of all cities in Washington (WA). Name the column 'average_washington_population'.
-- Expected answer is around 202,000
-- (1 row)
SELECT AVG(population) AS average_washington_population
FROM city
WHERE state_abbreviation = 'WA';
-- 13. The state (or territory) name and sales tax for the top five highest sales of tax of all states and territories. 
-- Order the results by sales tax with the highest number first, then by state name alphabetically.
-- (5 rows)
SELECT state_name, sales_tax
FROM state
ORDER BY sales_tax DESC, state_name ASC
LIMIT 5;
-- 14. The name and date established of the top 10 oldest national parks.
-- Order the results with the oldest park first.
-- (10 rows)
SELECT park_name, date_established
FROM park
ORDER BY date_established ASC
LIMIT 10;
-- 15. The name and date established of the newest national park.
-- (1 row)
SELECT park_name, date_established
FROM park
ORDER BY date_established DESC
LIMIT 1;
-- 16. The average area of national parks that have camping. Name the column 'average_park_area'.
-- Expected answer is around 3,900.
-- (1 row)
SELECT AVG(area) AS average_park_area
FROM park
WHERE has_camping = true;
-- 17. The highest population density of all records in the state table. Name the column 'population_density'.
-- Population density is expressed as people per square kilometer. In other words, population divided by area.
-- Exepcted answer is around 4,000
-- (1 row)
SELECT MAX(population/area) AS population_density
FROM state;
-- 18. The count of the number of cities (name column 'num_cities') and the state abbreviation for each state and territory (exclude state abbreviation DC).
-- Order the results by state abbreviation.
-- (55 rows)
SELECT COUNT(city_name) AS num_cities, state_abbreviation
FROM city
WHERE state_abbreviation != 'DC'
GROUP BY state_abbreviation
ORDER BY state_abbreviation;
-- 19. The census region and the number of records in the state table (name column 'num_states') for each census region. Exclude ones that don't have a census region.
-- Order the results from highest to lowest.
-- (Note: DC is in a census region, but the territories aren't, so the sum of the counts will equal 51).
-- (4 rows)
SELECT census_region, COUNT(state) AS num_states
FROM state
WHERE census_region IS NOT NULL
GROUP BY census_region
ORDER BY num_states DESC;
-- 20. The state abbreviation, and population of the largest city (name column 'city_population') of all states, territories, and districts.
-- Order the results from highest to lowest populations.
-- (56 rows)
SELECT state_abbreviation, MAX(population) AS city_population
FROM city
GROUP BY state_abbreviation
ORDER BY city_population DESC;
-- 21. The census region, and the average, minimum, and maximum population of states and districts in each census region. Exclude ones that don't have a census region.
-- Name the population columns 'average_population, 'min_population', and 'max_population'.
-- Order the results from lowest to highest average population.
-- (4 rows)
SELECT census_region, AVG(population) AS average_population, MIN(population) AS min_population, MAX(population) AS max_population
FROM state
WHERE census_region IS NOT NULL
GROUP BY census_region
ORDER BY average_population ASC;





