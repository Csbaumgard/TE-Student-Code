package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
    /*
    GetLucky([0, 2, 4]) → true
    GetLucky([1, 2, 3]) → false
    GetLucky([1, 2, 4]) → false
     */

    @Test
    public void getLucky_returns_true_given_0_2_4() {
        Lucky13 sut = new Lucky13();
        int[] array = {0, 2, 4};

        boolean getLucky = sut.getLucky(array);

        Assert.assertTrue(getLucky);
    }
    @Test
    public void getLucky_returns_false_given_1_2_3() {
        Lucky13 sut = new Lucky13();
        int[] array = {1, 2, 3};

        boolean getLucky = sut.getLucky(array);

        Assert.assertFalse(getLucky);
    }
}
