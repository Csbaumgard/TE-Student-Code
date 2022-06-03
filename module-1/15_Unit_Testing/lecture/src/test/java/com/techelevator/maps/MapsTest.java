package com.techelevator.maps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {
    private M1D08CollectionsPart2Exercise sut;

    @Before
    public void setup() {
        sut = new M1D08CollectionsPart2Exercise();
    }

    @Test
    public void wordCount_returns_ba2_black1_given_ba_ba_black_sheep() {
        // Arrange
        M1D08CollectionsPart2Exercise sut = new M1D08CollectionsPart2Exercise();
        String[] input = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> expected = Map.of("ba", 2, "black", 1, "sheep", 1);

        // Act
        Map<String, Integer> actual = sut.wordCount(input);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wordCount_returns_null_given_null() {
        // Arrange
        M1D08CollectionsPart2Exercise sut = new M1D08CollectionsPart2Exercise();

        // Act
        Map<String, Integer> actual = sut.wordCount(null);

        // Assert
        Assert.assertEquals(null, actual);

    }
}
