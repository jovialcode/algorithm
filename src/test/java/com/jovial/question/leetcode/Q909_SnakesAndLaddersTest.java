package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q909_SnakesAndLaddersTest {
    @Test
    void textExample_1() {
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };

        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        assertEquals(4, solution.snakesAndLadders(board));
    }

    @Test
    void textExample_2() {
        int[][] board = {{
            -1,-1},
            {-1,3}
        };

        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        solution.snakesAndLadders(board);
    }

    @Test
    void textExample_3() {
        int[][] board = {
            {1,1,-1},
            {1,1,1},
            {-1,1,1}
        };

        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        solution.snakesAndLadders(board);
    }

    @Test
    void textExample_4() {
        int[][] board = {
            {-1,-1,2,-1},
            {14,2,12,3},
            {4,9,1,11},
            {-1,2,1,16}
        };

        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        solution.snakesAndLadders(board);
    }

    @Test
    void textExample_5() {
        int[][] board = {
            {-1, -1, -1, -1, 48, 5, -1},
            {12, 29, 13, 9, -1, 2, 32},
            {-1, -1, 21, 7, -1, 12, 49},
            {42, 37, 21, 40, -1, 22, 12},
            {42, -1, 2, -1, -1, -1, 6},
            {39, -1, 35, -1, -1, 39, -1},
            {-1, 36, -1, -1, -1, -1, 5}
        };

        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        solution.snakesAndLadders(board);
    }

    @Test
    void testMoveStep1(){
        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        List<Integer> integers = solution.boardMove(6, 17);
        assertEquals(List.of(3, 4), integers);
    }

    @Test
    void testMoveStep2(){
        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        List<Integer> integers = solution.boardMove(6, 18);
        assertEquals(List.of(3, 5), integers);
    }

    @Test
    void testMoveStep3(){
        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        List<Integer> integers = solution.boardMove(6, 13);
        assertEquals(List.of(3, 0), integers);
    }

    @Test
    void testMoveStep4(){
        Q909_SnakesAndLadders.Solution solution = new Q909_SnakesAndLadders.Solution();
        List<Integer> integers = solution.boardMove(6, 12);
        assertEquals(List.of(4, 0), integers);
    }
}