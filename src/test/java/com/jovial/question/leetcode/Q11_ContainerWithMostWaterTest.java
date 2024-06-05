package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q11_ContainerWithMostWaterTest {
    @Test
    void testExample1() {
        var height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Q11_ContainerWithMostWater.Solution solution = new Q11_ContainerWithMostWater.Solution();
        assertEquals(49, solution.maxArea(height));
    }

    @Test
    void testExample2() {
        var height = new int[]{1, 1};
        Q11_ContainerWithMostWater.Solution solution = new Q11_ContainerWithMostWater.Solution();
        assertEquals(1, solution.maxArea(height));
    }

    @Test
    void testExample3() {
        var height = new int[]{1, 2, 4, 3};
        Q11_ContainerWithMostWater.Solution solution = new Q11_ContainerWithMostWater.Solution();
        assertEquals(4, solution.maxArea(height));
    }

    @Test
    void testExample4() {
        var height = new int[]{1, 8, 6, 2, 5, 4, 8, 25, 7};
        Q11_ContainerWithMostWater.Solution solution = new Q11_ContainerWithMostWater.Solution();
        assertEquals(49, solution.maxArea(height));
    }
}