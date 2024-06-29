package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q310_MinimumHeightTreesTest {
    @Test
    void testExample1() {
        var n = 4;
        var edges = new int[][]{
            {1, 0},
            {1, 2},
            {1, 3}
        };

        Q310_MinimumHeightTrees.Solution solution = new Q310_MinimumHeightTrees.Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(n, edges);
        assertEquals(new int[]{1}, minHeightTrees);
    }

    @Test
    void testExample2() {
        var n = 6;
        var edges = new int[][]{
            {3, 0},
            {3, 1},
            {3, 2},
            {3, 4},
            {5, 4},
        };

        Q310_MinimumHeightTrees.TopologySolution solution = new Q310_MinimumHeightTrees.TopologySolution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(n, edges);
    }
}