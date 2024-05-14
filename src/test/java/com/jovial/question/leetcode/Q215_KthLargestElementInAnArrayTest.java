package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q215_KthLargestElementInAnArrayTest {
    @Test
    void testExample(){
        var k = 2;
        var nums = new int[]{3, 2, 1, 5, 6, 4};
        Q215_KthLargestElementInAnArray.Solution solution = new Q215_KthLargestElementInAnArray.Solution();
        assertEquals(5, solution.findKthLargest(nums, k));
    }

    @Test
    void testExample2(){
        var k = 4;
        var nums = new int[]{3,2,3,1,2,4,5,5,6};
        Q215_KthLargestElementInAnArray.Solution solution = new Q215_KthLargestElementInAnArray.Solution();
        assertEquals(4, solution.findKthLargest(nums, k));
    }
}