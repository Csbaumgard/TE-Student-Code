package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
    /*
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
     */

    @Test
    public void getATable_returns_2_when_you5_date10() {
        DateFashion sut = new DateFashion();

        int getATable = sut.getATable(5, 10);

        Assert.assertEquals(2, getATable);
    }
    @Test
    public void getATable_returns_0_when_you5_date2() {
        DateFashion sut = new DateFashion();

        int getATable = sut.getATable(5, 2);

        Assert.assertEquals(0, getATable);
    }
    @Test
    public void getATable_returns_1_when_you5_date5() {
        DateFashion sut = new DateFashion();

        int getATable = sut.getATable(5, 5);

        Assert.assertEquals(1, getATable);
    }
}
