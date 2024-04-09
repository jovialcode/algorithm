package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(value = QuestionCategory.DP)
public class Q45_JumpGame2 {
    public static class Solution{
        public int jump(int[] nums) {
            final int MAX_NUMS = 10001;
            int[] ans = new int[MAX_NUMS];
            Arrays.fill(ans, MAX_NUMS);

            ans[0] = 0;
            for (int pos = 0; pos < nums.length; pos++) {
                tryJump(nums, ans, pos);
            }

            return ans[nums.length-1];
        }

        private void tryJump(int[] nums, int[] ans, int pos){
            int nextJump = nums[pos];
            for (int jump = 1; jump <= nextJump; jump++) {
                if(isOutOfRange(nums.length, pos + jump)) continue;
                ans[pos + jump] = Math.min(ans[pos] + 1, ans[pos + jump]);
            }
        }

        private boolean isOutOfRange(int maxIndex, int cur){
            return maxIndex <= cur || cur < 0;
        }
    }
}
