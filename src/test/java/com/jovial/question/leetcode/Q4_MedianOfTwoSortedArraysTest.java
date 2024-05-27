package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q4_MedianOfTwoSortedArraysTest {
    @Test
    void testExample() {
        var nums1 = new int[]{1, 3};
        var nums2 = new int[]{2};

        Q4_MedianOfTwoSortedArrays.Solution solution = new Q4_MedianOfTwoSortedArrays.Solution();
        assertEquals(2, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void testExample2() {
        var nums1 = new int[]{1, 2};
        var nums2 = new int[]{3, 4};

        Q4_MedianOfTwoSortedArrays.Solution solution = new Q4_MedianOfTwoSortedArrays.Solution();
        assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2));
    }
}