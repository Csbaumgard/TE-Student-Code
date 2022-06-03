package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    /*
     less20(18) → true
     less20(19) → true
     less20(20) → false
     */

    @Test
    public void isLessThanMultipleOf20_returns_true_given_18() {
        Less20 sut = new Less20();

        boolean isLessThanMultipleOf20 = sut.isLessThanMultipleOf20(18);

        Assert.assertEquals(true, isLessThanMultipleOf20);
    }
}
