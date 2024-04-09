package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q122_BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q122_BestTimeToBuyAndSellStock_Test {
    @Test
    public void testExample_1(){
        int[] prices = {7,1,5,3,6,4};
        Q122_BestTimeToBuyAndSellStock.Solution solution = new Q122_BestTimeToBuyAndSellStock.Solution();
        Assertions.assertEquals(7, solution.maxProfit(prices));
    }
}
