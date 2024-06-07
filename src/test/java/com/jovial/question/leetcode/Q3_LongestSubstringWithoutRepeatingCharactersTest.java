package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void testExample1(){
        var s = "abcabcbb";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample2(){
        var s = "bbbbb";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample3(){
        var s = "pwwkew";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample4(){
        var s = "dvdf";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample5(){
        var s = "cdd";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(2, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample6(){
        var s = "ckilbkd";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(5, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample7(){
        var s = "abba";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(2, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample8(){
        var s = "tmmzuxt";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(5, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testExample9(){
        var s = "wobgrovw";
        Q3_LongestSubstringWithoutRepeatingCharacters.Solution solution = new Q3_LongestSubstringWithoutRepeatingCharacters.Solution();
        assertEquals(6, solution.lengthOfLongestSubstring(s));
    }
}