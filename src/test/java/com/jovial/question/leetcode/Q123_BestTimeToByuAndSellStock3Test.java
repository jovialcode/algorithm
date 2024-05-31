package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q123_BestTimeToByuAndSellStock3Test {
    @Test
    void testExample() {
        var prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        Q123_BestTimeToByuAndSellStock3.Solution solution = new Q123_BestTimeToByuAndSellStock3.Solution();
        assertEquals(6, solution.maxProfit(prices));
    }

    @Test
    void testExample2() {
        var prices = new int[]{1, 2, 3, 4, 5};
        Q123_BestTimeToByuAndSellStock3.Solution solution = new Q123_BestTimeToByuAndSellStock3.Solution();
        assertEquals(4, solution.maxProfit(prices));
    }
}