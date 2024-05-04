package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q20_ValidParenthesesTest {
    @Test
    void testExample1(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertTrue(solution.isValid("()"));
    }

    @Test
    void testExample2(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void testExample3(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void testExample4(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertFalse(solution.isValid("(()]"));
    }

    @Test
    void testExample5(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertFalse(solution.isValid("("));
    }

    @Test
    void testExample6(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertFalse(solution.isValid("(("));
    }

    @Test
    void testExample7(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertTrue(solution.isValid("()"));
    }
    @Test
    void testExample8(){
        Q20_ValidParentheses.Solution solution = new Q20_ValidParentheses.Solution();
        assertFalse(solution.isValid(")"));
    }
}