package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q121_BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q121_BestTimeToBuyAndSellStock_Test {
    @Test
    public void testExample_1(){
        int[] prices = {7,1,5,3,6,4};
        Q121_BestTimeToBuyAndSellStock.Solution solution = new Q121_BestTimeToBuyAndSellStock.Solution();
        Assertions.assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    public void testExample_2(){
        int[] prices = {7,6,4,3,1};
        Q121_BestTimeToBuyAndSellStock.Solution solution = new Q121_BestTimeToBuyAndSellStock.Solution();
        Assertions.assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    public void testExample_3(){
        int[] prices = {4,1,5,2,7};
        Q121_BestTimeToBuyAndSellStock.Solution solution = new Q121_BestTimeToBuyAndSellStock.Solution();
        Assertions.assertEquals(6, solution.maxProfit(prices));
    }
}
