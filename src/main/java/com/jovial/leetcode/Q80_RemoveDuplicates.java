package com.jovial.leetcode;

public class Q80_RemoveDuplicates {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int answerPosition = 1;
            int prevValue = nums[0];
            int answer = 1;
            boolean same = false;

            for (int i = 1; i < nums.length; i++) {
                int value = nums[i];

                if(value != prevValue){
                    nums[answerPosition] = value;
                    prevValue = value;
                    answerPosition += 1;
                    answer += 1;
                    same = false;
                }else{
                    //2번 반복된 경우
                    if(!same) {
                        same = true;
                        nums[answerPosition] = value;
                        answerPosition += 1;
                        answer += 1;
                    }
                }
            }
            return answer;
        }
    }
}
