package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
    /*
            * GetHerd("giraffe") → "Tower"
            * GetHerd("") -> "unknown"
            * GetHerd("walrus") -> "unknown"
            * GetHerd("Rhino") -> "Crash"
            * GetHerd("rhino") -> "Crash"
            * GetHerd("elephants") -> "unknown"
    */


    @Test
    public void getHerd_returns_unknown_for_empty_string() {
        AnimalGroupName sut = new AnimalGroupName();

        String getHerd = sut.getHerd("");

        Assert.assertEquals("unknown", getHerd);
    }

    @Test
    public void getHerd_returns_Tower_given_Giraffe() {
        AnimalGroupName sut = new AnimalGroupName();

        String getHerd = sut.getHerd("Giraffe");

        Assert.assertEquals("Tower", getHerd);
    }

    @Test
    public void getHerd_returns_unknown_if_given_walrus() {
        AnimalGroupName sut = new AnimalGroupName();

        String getHerd = sut.getHerd("Walrus");

        Assert.assertEquals("unknown", getHerd);
    }

    @Test
    public void getHerd_returns_Crash_when_given_random_case_rhino() {
        AnimalGroupName sut = new AnimalGroupName();

        String getHerd = sut.getHerd("rHiNo");

        Assert.assertEquals("Crash", getHerd);
    }

    @Test
    public void getHerd_returns_herd_given_elephant() {
        AnimalGroupName sut = new AnimalGroupName();

        String getHerd = sut.getHerd("elephant");

        Assert.assertEquals("Herd", getHerd);
    }
}
