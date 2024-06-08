package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q41_FirstMissingPositiveTest {
    @Test
    void testExample() {
        var nums = new int[]{1, 2, 0};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(3, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample2() {
        var nums = new int[]{3, 4, -1, 1};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(2, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample3() {
        var nums = new int[]{7, 8, 9, 11, 12};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(1, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample4() {
        var nums = new int[]{1, 3, 4, 11, 12};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(2, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample5() {
        var nums = new int[]{1};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(2, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample6() {
        var nums = new int[]{2};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(1, solution.firstMissingPositive(nums));
    }

    @Test
    void testExample7() {
        var nums = new int[]{-1, -1, -2, -3, 5, 6, 2, 4, 5, 7, 1, 1};
        Q41_FirstMissingPositive.Solution solution = new Q41_FirstMissingPositive.Solution();
        assertEquals(3, solution.firstMissingPositive(nums));
    }
}