package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

public class Q380_InsertDeleteGetRandomTest {
    @Test
    public void testExample_1(){
        Q380_InsertDeleteGetRandom.RandomizedSet randomizedSet = new Q380_InsertDeleteGetRandom.RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(10);
        randomizedSet.insert(20);
        randomizedSet.insert(30);
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
    }
}
