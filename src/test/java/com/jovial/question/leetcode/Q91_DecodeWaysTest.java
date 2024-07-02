package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q91_DecodeWaysTest {
    @Test
    void testExample1(){
        Q91_DecodeWays.Solution solution = new Q91_DecodeWays.Solution();
        assertEquals(2, solution.numDecodings("12"));
    }

    @Test
    void testExample2(){
        Q91_DecodeWays.Solution solution = new Q91_DecodeWays.Solution();
        assertEquals(3, solution.numDecodings("226"));
    }

    @Test
    void testExample3(){
        Q91_DecodeWays.Solution solution = new Q91_DecodeWays.Solution();
        assertEquals(0, solution.numDecodings("06"));
    }

}