package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q44_WildcardMatchingTest {
    @Test
    void testExample1(){
        var s = "aa";
        var p = "a";

        Q44_WildcardMatching.Solution solution = new Q44_WildcardMatching.Solution();
        assertFalse(solution.isMatch(s, p));
    }

    @Test
    void testExample2(){
        var s = "aa";
        var p = "*";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    void testExample3(){
        var s = "abca";
        var p = "*?a";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    void testExample4(){
        var s = "cb";
        var p = "?a";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertFalse(solution.isMatch(s, p));
    }

    @Test
    void testExample5(){
        var s = "acdcb";
        var p = "a*c?b";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertFalse(solution.isMatch(s, p));
    }


    @Test
    void testExample7(){
        var s = "adceb";
        var p = "*a*b";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    void testExample8(){
        var s = "";
        var p = "******";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertTrue(solution.isMatch(s, p));
    }

    @Test
    void testExample9(){
        var s = "abcabczzzde";
        var p = "*abc???de*";

        Q44_WildcardMatching.RefineSolution solution = new Q44_WildcardMatching.RefineSolution();
        assertTrue(solution.isMatch(s, p));
    }
}