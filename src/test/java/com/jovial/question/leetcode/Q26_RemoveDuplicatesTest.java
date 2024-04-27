package com.jovial.question.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q26_RemoveDuplicatesTest {
    @Test
    public void testExample_1(){
        Q26_RemoveDuplicates.Solution solution = new Q26_RemoveDuplicates.Solution();

        int[] nums = {1,1,2};
        int expectedAnswer = 2;
        int answer = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void testExample_2(){
        Q26_RemoveDuplicates.Solution solution = new Q26_RemoveDuplicates.Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int expectedAnswer = 5;
        int answer = solution.removeDuplicates(nums);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
