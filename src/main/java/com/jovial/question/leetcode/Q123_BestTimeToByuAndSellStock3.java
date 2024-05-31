package com.jovial.question.leetcode;

import java.util.Arrays;

public class Q123_BestTimeToByuAndSellStock3 {
    public static class Solution {
        public int maxProfit(int[] prices) {
            int[][][] dp = new int[100001][2][3];

            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++)
                    Arrays.fill(dp[i][j], -1);
            }

            return solve(prices, dp, 0, 0, 2);
        }

        private int solve(int[] prices, int[][][] dp, int cur, int buy, int cnt) {
            if (cnt == 0 || cur == prices.length) return 0;
            if (dp[cur][buy][cnt] != -1) return dp[cur][buy][cnt];

            int ans = 0;
            if (buy == 0) {
                int pay = solve(prices, dp, cur + 1, 1, cnt) - prices[cur];
                int skip = solve(prices, dp, cur + 1, 0, cnt);
                ans = Math.max(pay, skip);

            } else {
                int sell = solve(prices, dp, cur + 1, 0, cnt - 1) + prices[cur];
                int skip = solve(prices, dp, cur + 1, 1, cnt);
                ans = Math.max(sell, skip);
            }

            return dp[cur][buy][cnt] = ans;
        }
    }
}
