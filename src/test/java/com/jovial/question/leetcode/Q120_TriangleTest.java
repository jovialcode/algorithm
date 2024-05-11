package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q120_TriangleTest {
    @Test
    void testExample(){
        Q120_Triangle.Solution solution = new Q120_Triangle.Solution();
        List<List<Integer>> triangle = List.of(
            List.of(2),
            List.of(3,4),
            List.of(6,5,7),
            List.of(4,1,8,3));

        assertEquals(11, solution.minimumTotal(triangle));
    }

    @Test
    void testExample2(){
        Q120_Triangle.Solution solution = new Q120_Triangle.Solution();
        List<List<Integer>> triangle = List.of(
            List.of(-10));
        assertEquals(-10, solution.minimumTotal(triangle));
    }

}