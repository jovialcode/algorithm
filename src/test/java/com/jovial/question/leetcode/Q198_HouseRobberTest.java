package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q198_HouseRobberTest {
    @Test
    void textExample1() {
        var nums = new int[]{1, 2, 3, 1};
        Q198_HouseRobber.Solution solution = new Q198_HouseRobber.Solution();
        assertEquals(4, solution.rob(nums));
    }

    @Test
    void textExample2() {
        var nums = new int[]{2, 7, 9, 3, 1};
        Q198_HouseRobber.Solution solution = new Q198_HouseRobber.Solution();
        assertEquals(12, solution.rob(nums));
    }

    @Test
    void textExample3() {
        var nums = new int[]{2,1,1,2};
        Q198_HouseRobber.Solution solution = new Q198_HouseRobber.Solution();
        assertEquals(4, solution.rob(nums));
    }
}