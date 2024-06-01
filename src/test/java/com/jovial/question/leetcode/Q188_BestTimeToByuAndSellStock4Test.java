package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q188_BestTimeToByuAndSellStock4Test {
    @Test
    void testExample1() {
        var k = 2;
        var prices = new int[]{2, 4, 1};

        Q188_BestTimeToByuAndSellStock4.Solution solution = new Q188_BestTimeToByuAndSellStock4.Solution();
        assertEquals(2, solution.maxProfit(k, prices));
    }

}