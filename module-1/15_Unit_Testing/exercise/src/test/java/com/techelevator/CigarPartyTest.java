package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
    /*
    haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
     */

    @Test
    public void haveParty_returns_false_when_given_30_on_weekday() {
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(30, false);

        Assert.assertFalse(haveParty);
    }
    @Test
    public void haveParty_returns_true_when_given_50_on_weekday() {
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(50, false);

        Assert.assertTrue(haveParty);
    }
    @Test
    public void haveParty_returns_true_when_given_70_on_weekend() {
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(70, true);

        Assert.assertTrue(haveParty);
    }
}
