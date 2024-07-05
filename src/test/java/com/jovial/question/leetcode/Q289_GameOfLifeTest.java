package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q289_GameOfLifeTest {
    @Test
    void testExample1() {
        var board = new int[][]{
            {0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}
        };

        Q289_GameOfLife.Solution solution = new Q289_GameOfLife.Solution();
        solution.gameOfLife(board);
    }

}