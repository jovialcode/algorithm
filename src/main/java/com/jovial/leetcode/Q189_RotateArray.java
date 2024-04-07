package com.jovial.leetcode;

import com.jovial.common.UnsolvedQuestion;

@UnsolvedQuestion(value = "풀이 확인함.")
public class Q189_RotateArray {
    static public class Solution {
        public void rotate(int[] nums, int k) {
            k = k%nums.length;
            reverseArray(nums, 0, nums.length-1);
            reverseArray(nums, 0, k-1);
            reverseArray(nums, k, nums.length-1);
        }

        public void reverseArray(int[] a, int l, int r){
            while(l <= r){
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
                l++; r--;
            }
        }
    }
}
