package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q14_LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q14_LongestCommonPrefix_Test {
    @Test
    void testExample_1(){
        Q14_LongestCommonPrefix.Solution solution = new Q14_LongestCommonPrefix.Solution();

        String[] strs = {"flower","flow","flight"};
        Assertions.assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    void testExample_2(){
        Q14_LongestCommonPrefix.Solution solution = new Q14_LongestCommonPrefix.Solution();

        String[] strs = {"dog","racecar","car"};
        Assertions.assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    void testExample_3(){
        Q14_LongestCommonPrefix.Solution solution = new Q14_LongestCommonPrefix.Solution();

        String[] strs = {"a"};
        Assertions.assertEquals("a", solution.longestCommonPrefix(strs));
    }

    @Test
    void testExample_4(){
        Q14_LongestCommonPrefix.Solution solution = new Q14_LongestCommonPrefix.Solution();

        String[] strs = {"ab", "a"};
        Assertions.assertEquals("a", solution.longestCommonPrefix(strs));
    }

    @Test
    void testExample_5(){
        Q14_LongestCommonPrefix.Solution solution = new Q14_LongestCommonPrefix.Solution();

        String[] strs = {"flower","flow","flight"};
        Assertions.assertEquals("fl", solution.longestCommonPrefix(strs));
    }
}
