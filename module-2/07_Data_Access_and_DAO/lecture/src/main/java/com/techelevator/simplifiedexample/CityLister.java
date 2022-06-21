package com.techelevator.simplifiedexample;

import com.techelevator.model.City;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class CityLister {
    public static void main(String[] args) {
        // 1. Define the data source we will connect to.
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        // 2. Write our query and execute it.

        String stateAbbreviation = "CA";
        String sql = "SELECT city_id, city_name, population FROM city WHERE state_abbreviation = ?;";


        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.queryForRowSet(sql, stateAbbreviation);


        // 3. Process results
        List<City> citiesInCaliforniaWithAtLeast1000 = new ArrayList<>();

        while (rowSet.next()) {

            City city = new City();
            city.setCityId();
            city.setCityName();
            city.setPopulation();
            city.setStateAbbreviation();

            citiesInCaliforniaWithAtLeast1000.add(city);

        }
    }
}
