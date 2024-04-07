package com.jovial.leetcode;

import java.util.Arrays;

public class Q27_RemoveElement {
    static class Solution{
        public int removeElement(int[] nums, int val){
            final int MAX_VALUE = 99;
            int answer = nums.length;

            for (int i = 0; i < nums.length ; i++) {
                if(nums[i] == val){
                    nums[i] = MAX_VALUE;
                    answer -= 1;
                }
            }

            Arrays.sort(nums);
            return answer;
        }
    }
}
