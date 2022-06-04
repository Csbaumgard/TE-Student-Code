package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
    /*
    GetPartialString("Hello", "There") → "ellohere"
     GetPartialString("java", "code") → "avaode"
     GetPartialString("shotl", "java") → "hotlava"
     */

    @Test
    public void GetPartialString_returns_ellohere_given_Hello_There() {
        NonStart sut = new NonStart();
        String getPartialString = sut.getPartialString("Hello", "There");
        Assert.assertEquals("ellohere", getPartialString);
    }
    @Test
    public void GetPartialString_returns_hotlava_given_shotl_java() {
        NonStart sut = new NonStart();
        String getPartialString = sut.getPartialString("shotl", "java");
        Assert.assertEquals("hotlava", getPartialString);
    }
    @Test
    public void GetPartialString_returns_emptystring_given_null_There() {
        NonStart sut = new NonStart();
        String getPartialString = sut.getPartialString(null, "There");
        Assert.assertEquals("here", getPartialString);
    }
    @Test
    public void GetPartialString_returns_emptystring_given_null() {
        NonStart sut = new NonStart();
        String getPartialString = sut.getPartialString(null, null);
        Assert.assertEquals("", getPartialString);
    }
    @Test
    public void GetPartialString_returns_emptystring_given_H_and_T() {
        NonStart sut = new NonStart();
        String getPartialString = sut.getPartialString("H", "T");
        Assert.assertEquals("", getPartialString);
    }
}
