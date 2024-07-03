package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.DP)
public class Q279_PerfectSquares {
    public static class Solution {
        public int numSquares(int n) {
            final int MAX_NUM = 10001;

            int[] dp = new int[MAX_NUM];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                for (int j = i; j > 0; j--) {
                    if (i - (j * j) >= 0) {
                        dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
                    }
                }
            }

            return dp[n];
        }
    }
}
