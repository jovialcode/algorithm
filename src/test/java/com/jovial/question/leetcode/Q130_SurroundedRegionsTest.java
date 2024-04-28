package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q130_SurroundedRegionsTest {
    @Test
    void testExample_1(){
        var grid = List.of(
                List.of('X','X','X','X'),
                List.of('X','O','O','X'),
                List.of('X','X','O','X'),
                List.of('X','O','X','X')
        );

        char[][] board = new char[grid.size()][grid.get(0).size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                board[i][j] = grid.get(i).get(j);
            }
        }

        Q130_SurroundedRegions.Solution solution = new Q130_SurroundedRegions.Solution();
        solution.solve(board);
    }

    @Test
    void testExample_2(){
        var grid = List.of(
                List.of('X','X','X'),
                List.of('X','O','X'),
                List.of('X','X','X')
        );

        char[][] board = new char[grid.size()][grid.get(0).size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                board[i][j] = grid.get(i).get(j);
            }
        }

        Q130_SurroundedRegions.Solution solution = new Q130_SurroundedRegions.Solution();
        solution.solve(board);
    }

    @Test
    void testExample_3(){
        var grid = List.of(
                List.of('O','O','O','O','X','X'),
                List.of('O','O','O','O','O','O'),
                List.of('O','X','O','X','O','O'),
                List.of('O','X','O','O','X','O'),
                List.of('O','X','O','X','O','O'),
                List.of('O','X','O','O','O','O')
        );

        char[][] board = new char[grid.size()][grid.get(0).size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                board[i][j] = grid.get(i).get(j);
            }
        }

        Q130_SurroundedRegions.Solution solution = new Q130_SurroundedRegions.Solution();
        solution.solve(board);
    }

    @Test
    void testExample_4(){
        var grid = List.of(
                List.of('O','X','O','O','O','X'),
                List.of('O','O','X','X','X','O'),
                List.of('X','X','X','X','X','O'),
                List.of('O','O','O','O','X','X'),
                List.of('X','X','O','O','X','O'),
                List.of('O','O','X','X','X','X')
        );

        char[][] board = new char[grid.size()][grid.get(0).size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                board[i][j] = grid.get(i).get(j);
            }
        }

        Q130_SurroundedRegions.Solution solution = new Q130_SurroundedRegions.Solution();
        solution.solve(board);
    }
}