package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q62_UniquePathTest {
    @Test
    void testExample1(){
        Q62_UniquePath.Solution solution = new Q62_UniquePath.Solution();
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void testExample2(){
        Q62_UniquePath.Solution solution = new Q62_UniquePath.Solution();
        assertEquals(3, solution.uniquePaths(3, 2));
    }
}