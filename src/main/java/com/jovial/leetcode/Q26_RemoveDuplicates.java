package com.jovial.leetcode;

public class Q26_RemoveDuplicates {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int answerPosition = 1;
            int prevValue = nums[0];
            int answer = 1;
            for (int i = 1; i < nums.length; i++) {
                int value = nums[i];

                if(value > prevValue){
                    nums[answerPosition] = value;
                    prevValue = value;
                    answerPosition += 1;
                    answer += 1;
                }
            }
            return answer;
        }
    }
}
