package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q139_WordBreakTest {
    @Test
    void testExample1(){
        var s = "leetcode";
        var wordDict = List.of("leet","code");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void testExample2(){
        var s = "applepenapple";
        var wordDict = List.of("apple","pen");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void testExample3(){
        var s = "catsandog";
        var wordDict = List.of("cats","dog","sand","and","cat");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertFalse(solution.wordBreak(s, wordDict));
    }

    @Test
    void testExample4(){
        var s = "bb";
        var wordDict = List.of("a","b","bbb","bbbb");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void testExample5(){
        var s = "cars";
        var wordDict = List.of("car","ca","rs");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertTrue(solution.wordBreak(s, wordDict));
    }

    @Test
    void testExample6(){
        var s = "catsandogcat";
        var wordDict = List.of("cats","dog","sand","and","cat","an");

        Q139_WordBreak.Solution solution = new Q139_WordBreak.Solution();
        assertTrue(solution.wordBreak(s, wordDict));
    }
}