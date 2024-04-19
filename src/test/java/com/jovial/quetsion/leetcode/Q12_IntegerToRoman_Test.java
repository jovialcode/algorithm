package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q12_IntegerToRoman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q12_IntegerToRoman_Test {
    @Test
    void testExample_1(){
        Q12_IntegerToRoman.Solution solution = new Q12_IntegerToRoman.Solution();
        Assertions.assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void testExample_2(){
        Q12_IntegerToRoman.Solution solution = new Q12_IntegerToRoman.Solution();
        Assertions.assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void testExample_3(){
        Q12_IntegerToRoman.Solution solution = new Q12_IntegerToRoman.Solution();
        Assertions.assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}
