package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q48_RotateImageTest {
    @Test
    void testExample1() {
        var matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Q48_RotateImage.Solution solution = new Q48_RotateImage.Solution();
        solution.rotate(matrix);
        System.out.println(matrix);
    }

    @Test
    void testExample2() {
        var matrix = new int[][]{
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16},
        };
        Q48_RotateImage.Solution solution = new Q48_RotateImage.Solution();
        solution.rotate(matrix);
        System.out.println(matrix);
    }
}