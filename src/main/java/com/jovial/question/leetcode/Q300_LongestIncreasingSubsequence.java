package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(value = QuestionCategory.DP)
public class Q300_LongestIncreasingSubsequence {
    public static class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length + 1];

            dp[nums.length - 1] = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                int longest = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j])
                        longest = Math.max(longest, dp[j] + 1);
                }
                dp[i] = longest;
            }

            return Arrays.stream(dp).max().getAsInt();
        }
    }
}
