package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category({QuestionCategory.SLIDING_WINDOW})
public class Q209_MinimumSizeSubarraySum {
    public static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int[] dp = new int[nums.length + 1];

            int maxValue = getSumDPAndMaxValue(nums, dp);
            int window = maxValue < target ? target/maxValue : 1;
            for (; window <= nums.length; window++) {
                int sum = dp[window - 1];
                int start = window;
                while (start < nums.length && sum < target) {
                    sum -= nums[start - window];
                    sum += nums[start];
                    start += 1;
                }

                if (sum >= target) {
                    return window;
                }
            }
            return 0;
        }

        private int getSumDPAndMaxValue(int[] nums, int[] dp) {
            int value = nums[0];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                value = Math.max(value, nums[i]);
                dp[i] = dp[i-1] + nums[i];
            }
            return value;
        }
    }
}
