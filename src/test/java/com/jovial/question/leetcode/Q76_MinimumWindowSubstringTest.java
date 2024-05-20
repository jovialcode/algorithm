package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q76_MinimumWindowSubstringTest {
    @Test
    void testExample(){
        var s = "ADOBECODEBANC";
        var t = "ABC";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("BANC", solution.minWindow(s, t));
    }

    @Test
    void testExample2(){
        var s = "a";
        var t = "b";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("", solution.minWindow(s, t));
    }

    @Test
    void testExample3(){
        var s = "ab";
        var t = "b";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("b", solution.minWindow(s, t));
    }

    @Test
    void testExample4(){
        var s = "ab";
        var t = "a";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("a", solution.minWindow(s, t));
    }

    @Test
    void testExample5(){
        var s = "babb";
        var t = "baba";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("", solution.minWindow(s, t));
    }

    @Test
    void testExample6(){
        var s = "aBbaBBBBA";
        var t = "BBA";

        Q76_MinimumWindowSubstring.Solution solution = new Q76_MinimumWindowSubstring.Solution();
        assertEquals("", solution.minWindow(s, t));
    }
}