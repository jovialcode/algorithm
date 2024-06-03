package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1143_LongestCommonSubsequenceTest {
    @Test
    void testExample1(){
        var text1 = "abcde";
        var text2 = "ace";

        Q1143_LongestCommonSubsequence.Solution solution = new Q1143_LongestCommonSubsequence.Solution();
        assertEquals(3, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    void testExample2(){
        var text1 = "abc";
        var text2 = "abc";

        Q1143_LongestCommonSubsequence.Solution solution = new Q1143_LongestCommonSubsequence.Solution();
        assertEquals(3, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    void testExample3(){
        var text1 = "abc";
        var text2 = "def";

        Q1143_LongestCommonSubsequence.Solution solution = new Q1143_LongestCommonSubsequence.Solution();
        assertEquals(0, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    void testExample4(){
        var text1 = "bcde";
        var text2 = "abc";

        Q1143_LongestCommonSubsequence.Solution solution = new Q1143_LongestCommonSubsequence.Solution();
        assertEquals(2, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    void testExample5(){
        var text1 = "hofubmnylkra";
        var text2 = "pqhgxgdofcvmr";

        Q1143_LongestCommonSubsequence.Solution solution = new Q1143_LongestCommonSubsequence.Solution();
        assertEquals(5, solution.longestCommonSubsequence(text1, text2));
    }
}