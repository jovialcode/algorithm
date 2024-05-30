package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q149_MaxPointsOnALineTest {
    @Test
    void testExample() {
        var points = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        Q149_MaxPointsOnALine.Solution solution = new Q149_MaxPointsOnALine.Solution();
        assertEquals(3, solution.maxPoints(points));
    }

    @Test
    void testExample2() {
        var points = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        Q149_MaxPointsOnALine.Solution solution = new Q149_MaxPointsOnALine.Solution();
        assertEquals(4, solution.maxPoints(points));
    }

    @Test
    void testExample3() {
        var points = new int[][]{{4, 5}, {4, -1}, {4, 0}};
        Q149_MaxPointsOnALine.Solution solution = new Q149_MaxPointsOnALine.Solution();
        assertEquals(3, solution.maxPoints(points));
    }

    @Test
    void testExample4() {
        var points = new int[][]{{-6, -1}, {3, 1}, {12, 3}};
        Q149_MaxPointsOnALine.Solution solution = new Q149_MaxPointsOnALine.Solution();
        assertEquals(3, solution.maxPoints(points));
    }
}