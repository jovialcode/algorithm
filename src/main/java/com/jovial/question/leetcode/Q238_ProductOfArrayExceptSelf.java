package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.MATH)
public class Q238_ProductOfArrayExceptSelf {
    public static class Solution{
        public int[] productExceptSelf(int[] nums){
            final int MAX_LENGTH = nums.length;
            int[] ans = new int[MAX_LENGTH];
            int[] prefix = new int[MAX_LENGTH];
            int[] suffix = new int[MAX_LENGTH];

            suffix[MAX_LENGTH - 1] = 1;
            prefix[0] = 1;
            for (int idx = 1; idx < MAX_LENGTH; idx++) {
                suffix[MAX_LENGTH - idx -1] = suffix[MAX_LENGTH - idx] * nums[MAX_LENGTH - idx];
                prefix[idx] = prefix[idx -1] * nums[idx - 1];
            }

            for (int idx = 0; idx < nums.length; idx++) {
                ans[idx] = prefix[idx] * suffix[idx];
            }
            return ans;
        }
    }
}
