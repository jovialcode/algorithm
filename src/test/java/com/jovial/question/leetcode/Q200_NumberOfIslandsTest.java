package com.jovial.question.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class Q200_NumberOfIslandsTest {
    @Test
    void testExample_1(){
        var grid = List.of(
                List.of('1','1','1','1','0'),
                List.of('1','1','0','1','0'),
                List.of('1','1','0','0','0'),
                List.of('0','0','0','0','0')
        );

        char[][] charGrid = new char[grid.size()][grid.get(0).size()];

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                charGrid[i][j] = grid.get(i).get(j);
            }
        }

        Q200_NumberOfIslands.Solution solution = new Q200_NumberOfIslands.Solution();
        Assertions.assertEquals(1, solution.numIslands(charGrid));


    }
}