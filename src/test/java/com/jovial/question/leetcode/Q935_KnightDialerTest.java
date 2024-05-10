package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q935_KnightDialerTest {
    @Test
    void testExample1(){
        Q935_KnightDialer.Solution solution = new Q935_KnightDialer.Solution();
        assertEquals(136006598, solution.knightDialer(3131));
    }

    @Test
    void testExample2(){
        Q935_KnightDialer.Solution solution = new Q935_KnightDialer.Solution();
        assertEquals(20, solution.knightDialer(2));
    }

    @Test
    void testExample3(){
        Q935_KnightDialer.Solution solution = new Q935_KnightDialer.Solution();
        assertEquals(46, solution.knightDialer(3));
    }
}