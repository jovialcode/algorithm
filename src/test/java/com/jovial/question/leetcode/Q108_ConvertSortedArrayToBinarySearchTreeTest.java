package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q108_ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    void testExample1(){
        var nums = new int[]{-10, -3, 0, 5, 9};
        Q108_ConvertSortedArrayToBinarySearchTree.Solution solution = new Q108_ConvertSortedArrayToBinarySearchTree.Solution();
        solution.sortedArrayToBST(nums);
    }
}