package com.jovial.question.leetcode;

import com.jovial.common.annotation.Category;
import com.jovial.common.annotation.Unsolved;
import com.jovial.common.QuestionCategory;

@Unsolved(value = "풀이 확인함.")
@Category(value = QuestionCategory.STRUCTURE)
public class Q189_RotateArray {
    public static class Solution {
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
