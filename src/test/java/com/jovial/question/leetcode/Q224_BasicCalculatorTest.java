package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q224_BasicCalculatorTest {
    @Test
    void testExample(){
        Q224_BasicCalculator.Solution solution = new Q224_BasicCalculator.Solution();
        assertEquals(2, solution.calculate("1+1"));
    }

    @Test
    void testExample2(){
        Q224_BasicCalculator.Solution solution = new Q224_BasicCalculator.Solution();
        assertEquals(3, solution.calculate(" 2-1 + 2 "));
    }

    @Test
    void testExample3(){
        Q224_BasicCalculator.Solution solution = new Q224_BasicCalculator.Solution();
        assertEquals(23, solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    void testExample4(){
        Q224_BasicCalculator.Solution solution = new Q224_BasicCalculator.Solution();
        assertEquals(3, solution.calculate("1-(     -2)"));
    }
}