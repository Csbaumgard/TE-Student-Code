package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
    /*
    GetBits("Hello") → "Hlo"
    GetBits("Hi") → "H"
    GetBits("Heeololeo") → "Hello"
     */

    @Test
    public void getBits_returns_Hlo_given_Hello() {
        StringBits sut = new StringBits();
        String getBits = sut.getBits("Hello");
        Assert.assertEquals("Hlo", getBits);
    }
}
