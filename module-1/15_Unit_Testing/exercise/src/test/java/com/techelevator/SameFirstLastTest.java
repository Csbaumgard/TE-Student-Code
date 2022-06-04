package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {
    /*
    IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */

    @Test
    public void isItTheSame_returns_false_given_123() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {1, 2, 3};
        boolean isItTheSame = sut.isItTheSame(array);
        Assert.assertFalse(isItTheSame);
    }
    @Test
    public void isItTheSame_returns_false_given_empty_array() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {};
        boolean isItTheSame = sut.isItTheSame(array);
        Assert.assertFalse(isItTheSame);
    }
    @Test
    public void isItTheSame_returns_true_given_1231() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {1, 2, 3, 1};
        boolean isItTheSame = sut.isItTheSame(array);
        Assert.assertTrue(isItTheSame);
    }
    @Test
    public void isItTheSame_returns_false_given_null() {
        SameFirstLast sut = new SameFirstLast();
        boolean isItTheSame = sut.isItTheSame(null);
        Assert.assertFalse(isItTheSame);
    }
}
