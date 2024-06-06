package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q32_LongestValidParenthesesTest {
    @Test
    void testExample1(){
        var s = "(()";
        Q32_LongestValidParentheses.Solution solution = new Q32_LongestValidParentheses.Solution();
        assertEquals(2, solution.longestValidParentheses(s));
    }

    @Test
    void testExample2(){
        var s = ")()())";
        Q32_LongestValidParentheses.Solution solution = new Q32_LongestValidParentheses.Solution();
        assertEquals(4, solution.longestValidParentheses(s));
    }

    @Test
    void testExample3(){
        var s = "";
        Q32_LongestValidParentheses.Solution solution = new Q32_LongestValidParentheses.Solution();
        assertEquals(0, solution.longestValidParentheses(s));
    }

    @Test
    void testExample4(){
        var s = "()(()";
        Q32_LongestValidParentheses.Solution solution = new Q32_LongestValidParentheses.Solution();
        assertEquals(2, solution.longestValidParentheses(s));
    }

    @Test
    void testExample5(){
        var s = ")()())()()(";
        Q32_LongestValidParentheses.Solution solution = new Q32_LongestValidParentheses.Solution();
        assertEquals(4, solution.longestValidParentheses(s));
    }
}