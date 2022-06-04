package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    /*
     * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
     * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * getCount([]) → {}
     * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
     */

    @Test
    public void getCount_returns_ba2_black1_sheep_1() {
        WordCount sut = new WordCount();
        String[] array = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> map = Map.of("ba", 2, "black", 1, "sheep", 1);
        Map<String,Integer> realMap = sut.getCount(array);
        Assert.assertEquals(map, realMap);

    }
}
