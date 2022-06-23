package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;


    ///THIS_ONE///


    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        // Arrange
        int parkId = 2;

        // Act
        Park actualPark = sut.getPark(parkId);

        // ASSert
        Assert.assertEquals(PARK_2.getParkId(), actualPark.getParkId());
        Assert.assertEquals(PARK_2.getParkId(), actualPark.getParkId());
        Assert.assertEquals(PARK_2.getParkId(), actualPark.getParkId());

    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        // Arrange
        int parkId = -1;

        // Act
        Park actualPark = sut.getPark(parkId);

        // ASSert
        Assert.assertNull(actualPark);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        // Arrange
        String stateAbbreviation = "AA";

        // Act
        List<Park> parks = sut.getParksByState(stateAbbreviation);

        // ASSert
        Assert.assertNotNull(parks);
        Assert.assertEquals(2, parks.size());
        assertParksMatch(PARK_1, parks.get(0));
        assertParksMatch(PARK_3, parks.get(1));
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        // Arrange
        String stateAbbreviation = "XX";

        // Act
        List<Park> parks = sut.getParksByState(stateAbbreviation);

        // ASSert
        Assert.assertNotNull(parks);
        Assert.assertEquals(0, parks.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        // Arrange
        Park newPark = new Park(-1, "DisneyWorld", LocalDate.of(1950, 2, 20), 1.5, false);

        // Act
        Park actualPark = sut.createPark(newPark);

        // ASSert
        newPark.setParkId(actualPark.getParkId());
        assertParksMatch(newPark, actualPark);
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        // Arrange
        Park newPark = new Park(-1, "DisneyWorld", LocalDate.of(1950, 2, 20), 1.5, false);

        // Act
        Park actualPark = sut.createPark(newPark);
        int insertedParkId = actualPark.getParkId();
        Park retrievedPark = sut.getPark(insertedParkId);

        // ASSert
        newPark.setParkId(actualPark.getParkId());
        assertParksMatch(newPark, retrievedPark);
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        Assert.fail();
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        Assert.fail();
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        Assert.fail();
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
