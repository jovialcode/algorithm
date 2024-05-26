package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q52_NQueens2Test {
    @Test
    void testExample1(){
        Q52_NQueens2.Solution solution = new Q52_NQueens2.Solution();
        assertEquals(2, solution.totalNQueens(4));
    }

    @Test
    void testExample2(){
        Q52_NQueens2.Solution solution = new Q52_NQueens2.Solution();
        assertEquals(10, solution.totalNQueens(5));
    }
}