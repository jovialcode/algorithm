package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q58_LengthOfLastWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q58_LengthOfLastWord_Test {
    @Test
    void testExample_1(){
        String s = "Hello World";
        Q58_LengthOfLastWord.Solution solution = new Q58_LengthOfLastWord.Solution();
        Assertions.assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    void testExample_2(){
        String s = "   fly me   to   the moon  ";
        Q58_LengthOfLastWord.Solution solution = new Q58_LengthOfLastWord.Solution();
        Assertions.assertEquals(4, solution.lengthOfLastWord(s));
    }

    @Test
    void testExample_3(){
        String s = "luffy is still joyboy";
        Q58_LengthOfLastWord.Solution solution = new Q58_LengthOfLastWord.Solution();
        Assertions.assertEquals(6, solution.lengthOfLastWord(s));
    }
}
