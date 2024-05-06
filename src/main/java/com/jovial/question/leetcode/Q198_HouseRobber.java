package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(value = QuestionCategory.DP)
public class Q198_HouseRobber {
    public static class Solution {
        public int rob(int[] nums) {
            int[] dp = new int[101];

            dp[0] = nums[0];

            if (nums.length < 2) return nums[0];

            dp[1] = Math.max(dp[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            }

            return dp[nums.length - 1];
        }
    }
}
