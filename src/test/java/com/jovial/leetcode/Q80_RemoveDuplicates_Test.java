package com.jovial.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q80_RemoveDuplicates_Test {
    @Test
    public void testExample_1(){
        Q80_RemoveDuplicates.Solution solution = new Q80_RemoveDuplicates.Solution();

        int[] nums = {1,1,1,2,2,3};
        int expectedAnswer = 5;
        int answer = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void testExample_2(){
        Q80_RemoveDuplicates.Solution solution = new Q80_RemoveDuplicates.Solution();

        int[] nums = {0,0,1,1,1,1,2,3,3};
        int expectedAnswer = 7;
        int answer = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
