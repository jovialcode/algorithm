package com.jovial.question.leetcode;

import com.jovial.common.annotation.Algorithm;
import com.jovial.common.annotation.Category;
import com.jovial.common.QuestionCategory;

@Algorithm(value = "Kadane’s Algorithm")
@Category(value = QuestionCategory.MATH)
public class Q121_BestTimeToBuyAndSellStock {
    public static class Solution{
        public int maxProfit(int[] prices) {
            int profit = 0;
            int buy = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if(prices[i] < buy){
                    buy = prices[i];
                }else if(prices[i] - buy > profit){
                    profit = prices[i] - buy;
                }
            }
            return profit;
        }
    }
}
