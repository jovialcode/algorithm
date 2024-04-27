package com.jovial.question.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q122_BestTimeToBuyAndSellStockTest {
    @Test
    public void testExample_1(){
        int[] prices = {7,1,5,3,6,4};
        Q122_BestTimeToBuyAndSellStock.Solution solution = new Q122_BestTimeToBuyAndSellStock.Solution();
        Assertions.assertEquals(7, solution.maxProfit(prices));
    }
}
