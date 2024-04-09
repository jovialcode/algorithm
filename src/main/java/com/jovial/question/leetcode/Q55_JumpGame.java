package com.jovial.question.leetcode;

import com.jovial.common.annotation.Explanation;

@Explanation(value = "takes a lot of time")
public class Q55_JumpGame {
    public static class Solution{
        public boolean canJump(int[] nums) {
            final int MAX_NUMS = 10001;
            boolean[] isVisit = new boolean[MAX_NUMS];
            tryJump(nums, isVisit,0);

            return isVisit[nums.length-1];
        }

        private void tryJump(int[] nums, boolean[] isVisit, int pos){
            if(isVisit[pos]) return;
            isVisit[pos] = true;

            // try next step
            int nextJump = nums[pos];
            for (int jump = 1; jump <= nextJump; jump++) {
                if(isOutOfRange(nums.length, pos + jump)) continue;
                tryJump(nums, isVisit, pos + jump);
            }
        }

        private boolean isOutOfRange(int maxIndex, int cur){
            return maxIndex <= cur;
        }

        /*
            public boolean canJump(int[] nums) {
               int reachable = 0;
               for(int i = 0; i < nums.length; i ++) {
                   if(i > reachable) return false;
                   reachable = Math.max(reachable, i + nums[i]);
               }
               return true;
            }
        **/
    }
}
