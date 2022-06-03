package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    /*
    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
	frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    @Test
    public void frontTimes_returns_empty_string_given_null() {
        FrontTimes sut = new FrontTimes();

        String generateString = sut.generateString("", 5);

        Assert.assertEquals("", generateString);
    }
    @Test
    public void frontTimes_returns_chocho_given_chocolate_2() {
        FrontTimes sut = new FrontTimes();

        String generateString = sut.generateString("Chocolate", 2);

        Assert.assertEquals("ChoCho", generateString);
    }
    @Test
    public void frontTimes_returns_abcabcabc_given_abc_3() {
        FrontTimes sut = new FrontTimes();

        String generateString = sut.generateString("Abc", 3);

        Assert.assertEquals("AbcAbcAbc", generateString);
    }
    @Test
    public void frontTimes_returns_whats_given_when_given_less_than_3_string_times_3() {
        FrontTimes sut = new FrontTimes();

        String generateString = sut.generateString("No", 3);

        Assert.assertEquals("NoNoNo", generateString);
    }
}
