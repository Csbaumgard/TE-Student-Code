package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    /*
    MakeArray([1, 2, 3]) → [3, 3, 3]
     MakeArray([11, 5, 9]) → [11, 11, 11]
     MakeArray([2, 11, 3]) → [3, 3, 3]
     */

    @Test
    public void makeArray_returns_333_given_123() {
        MaxEnd3 sut = new MaxEnd3();
        int[] array = {1, 2, 3};
        int[] expectedArray = {3, 3, 3};
        int[] makeArray = sut.makeArray(array);

        Assert.assertArrayEquals(expectedArray, makeArray);
    }
}
