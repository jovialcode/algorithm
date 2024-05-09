package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q300_LongestIncreasingSubsequenceTest {
    @Test
    void testExample1(){
        var nums = new int[]{10,9,2,5,3,7,101,18};
        Q300_LongestIncreasingSubsequence.Solution solution = new Q300_LongestIncreasingSubsequence.Solution();
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    void testExample2(){
        var nums = new int[]{10,9,2,5,1,4,101,18};
        Q300_LongestIncreasingSubsequence.Solution solution = new Q300_LongestIncreasingSubsequence.Solution();
        assertEquals(3, solution.lengthOfLIS(nums));
    }

    @Test
    void testExample3(){
        var nums = new int[]{0,1,0,3,2,3};
        Q300_LongestIncreasingSubsequence.Solution solution = new Q300_LongestIncreasingSubsequence.Solution();
        assertEquals(4, solution.lengthOfLIS(nums));
    }

    @Test
    void testExample4(){
        var nums = new int[]{1,3,6,7,9,4,10,5,6};
        Q300_LongestIncreasingSubsequence.Solution solution = new Q300_LongestIncreasingSubsequence.Solution();
        assertEquals(6, solution.lengthOfLIS(nums));
    }
}