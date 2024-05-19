package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q209_MinimumSizeSubarraySumTest {
    @Test
    void testExample1(){
        var target = 7;
        var nums = new int[]{2,3,1,2,4,3};
        Q209_MinimumSizeSubarraySum.Solution solution = new Q209_MinimumSizeSubarraySum.Solution();
        assertEquals(2, solution.minSubArrayLen(target, nums));
    }

    @Test
    void testExample2(){
        var target = 4;
        var nums = new int[]{1,4,4};
        Q209_MinimumSizeSubarraySum.Solution solution = new Q209_MinimumSizeSubarraySum.Solution();
        assertEquals(1, solution.minSubArrayLen(target, nums));
    }

    @Test
    void testExample3(){
        var target = 11;
        var nums = new int[]{1,1,1,1,1,1,1,1};
        Q209_MinimumSizeSubarraySum.Solution solution = new Q209_MinimumSizeSubarraySum.Solution();
        assertEquals(0, solution.minSubArrayLen(target, nums));
    }

    @Test
    void testExample4(){
        var target = 15;
        var nums = new int[]{1,2,3,4,5};
        Q209_MinimumSizeSubarraySum.Solution solution = new Q209_MinimumSizeSubarraySum.Solution();
        assertEquals(5, solution.minSubArrayLen(target, nums));
    }
}