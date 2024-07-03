package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q279_PerfectSquaresTest {
    @Test
    void testExample1(){
        Q279_PerfectSquares.Solution solution = new Q279_PerfectSquares.Solution();
        assertEquals(2, solution.numSquares(13));
    }
}