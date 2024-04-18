package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q13_RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q13_RomanToInteger_Test {
    @Test
    void testExample_1(){
        String s = "III";
        Q13_RomanToInteger.Solution solution = new Q13_RomanToInteger.Solution();
        Assertions.assertEquals(3, solution.romanToInt(s));
    }

    @Test
    void testExample_2(){
        String s = "LVIII";
        Q13_RomanToInteger.Solution solution = new Q13_RomanToInteger.Solution();
        Assertions.assertEquals(58, solution.romanToInt(s));
    }

    @Test
    void testExample_3(){
        String s = "MCMXCIV";
        Q13_RomanToInteger.Solution solution = new Q13_RomanToInteger.Solution();
        Assertions.assertEquals(1994, solution.romanToInt(s));
    }
}
