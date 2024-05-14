package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q502_IPOTest {
    @Test
    void testExample1() {
        var k = 2;
        var w = 0;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{0, 1, 1};

        Q502_IPO.Solution solution = new Q502_IPO.Solution();
        assertEquals(4, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void testExample2() {
        var k = 3;
        var w = 0;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{0, 1, 2};

        Q502_IPO.Solution solution = new Q502_IPO.Solution();
        assertEquals(6, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void testExample3() {
        var k = 1;
        var w = 2;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{1, 1, 2};

        Q502_IPO.Solution solution = new Q502_IPO.Solution();
        assertEquals(5, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void testExample4() {
        var k = 11;
        var w = 11;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{11, 12, 13};

        Q502_IPO.Solution solution = new Q502_IPO.Solution();
        assertEquals(17, solution.findMaximizedCapital(k, w, profits, capital));
    }

    @Test
    void testExample5() {
        var k = 11;
        var w = 11;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{11, 12, 13};

        Q502_IPO.Solution solution = new Q502_IPO.Solution();
        assertEquals(17, solution.findMaximizedCapital(k, w, profits, capital));
    }
}