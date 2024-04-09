package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Algorithm;
import com.jovial.common.annotation.Category;

@Algorithm(value = "Buy cheap and sell expensive")
@Category(value = QuestionCategory.MATH)
public class Q122_BestTimeToBuyAndSellStock {
    public static class Solution{
        public int maxProfit(int[] prices) {
            int profit = 0;
            int stock = prices[0];
            int answer = 0;
            int n = prices.length;
            for(int i = 1; i < n; i++){
                if(prices[i] < stock){
                    stock = prices[i];
                }
                if(prices[i] > prices[i-1]){
                    profit = prices[i] - stock;
                    stock = prices[i];
                    answer += profit;
                }
            }
            return answer;
        }
    }
}
