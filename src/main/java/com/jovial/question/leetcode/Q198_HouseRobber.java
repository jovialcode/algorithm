package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(value = QuestionCategory.DP)
public class Q198_HouseRobber {
    public static class Solution {
        public int rob(int[] nums) {
            int[][] dp = new int[101][2];

            dp[0][0] = 0;
            dp[0][1] = nums[0];

            if (nums.length < 2) return nums[0];

            dp[1][0] = 0;
            dp[1][1] = Math.max(dp[0][1], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 2][1]);
                dp[i][1] = Math.max(dp[i - 1][0] + nums[i], dp[i - 2][0] + nums[i]);
                dp[i][1] = Math.max(dp[i][1], dp[i - 2][1] + nums[i]);
            }

            return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
        }
    }
}
