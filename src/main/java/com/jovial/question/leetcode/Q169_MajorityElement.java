package com.jovial.question.leetcode;

import java.util.Arrays;

public class Q169_MajorityElement {
    public static class Solution{
        public int majorityElement(int[] nums) {
            // sorting
            Arrays.sort(nums);

            int answer = nums[0];
            int max_cnt = 1;
            int cnt = 1;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] == nums[i-1]){
                    cnt += 1;
                }else{
                    cnt = 1;
                }

                if(max_cnt < cnt){
                    max_cnt = cnt;
                    answer = nums[i-1];
                }
            }

            return answer;
        }
    }
}
