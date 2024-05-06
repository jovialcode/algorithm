package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(value = QuestionCategory.DP)
public class Q70_ClimbingStairs {
    public static class Solution {
        public int climbStairs(int n) {
            int dp[] = new int[n + 1];

            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            for (int next = 2; next <= n; next++) {
                dp[next] = dp[next - 1] + dp[next - 2];
            }

            return dp[n];
        }
    }
}
