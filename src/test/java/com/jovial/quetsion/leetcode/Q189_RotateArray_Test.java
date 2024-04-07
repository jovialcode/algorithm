package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q189_RotateArray;
import org.junit.jupiter.api.Test;

public class Q189_RotateArray_Test {
    @Test
    public void testExample_1(){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        Q189_RotateArray.Solution solution = new Q189_RotateArray.Solution();
        solution.rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void testExample_2(){
        int[] nums = {-1,-100,3,99};
        int k = 2;

        Q189_RotateArray.Solution solution = new Q189_RotateArray.Solution();
        solution.rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
