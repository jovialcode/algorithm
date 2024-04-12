package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q238_ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q238_ProductOfArrayExceptSelf_Test {
    @Test
    void testExample_1(){
        Q238_ProductOfArrayExceptSelf.Solution solution = new Q238_ProductOfArrayExceptSelf.Solution();
        int[] nums = {1,2,3,4};
        int[] ans = {24,12,8,6};
        Assertions.assertArrayEquals(ans, solution.productExceptSelf(nums));
    }

    @Test
    void testExample_2(){
        Q238_ProductOfArrayExceptSelf.Solution solution = new Q238_ProductOfArrayExceptSelf.Solution();
        int[] nums = {-1,1,0,-3,3};
        int[] ans = {0,0,9,0,0};
        Assertions.assertArrayEquals(ans, solution.productExceptSelf(nums));
    }
}
