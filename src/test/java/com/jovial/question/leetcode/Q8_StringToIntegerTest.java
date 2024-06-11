package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q8_StringToIntegerTest {
    @Test
    void testExample(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(-42, solution.myAtoi("-042"));
    }

    @Test
    void testExample2(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    void testExample3(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(1337, solution.myAtoi("1337c0d3"));
    }

    @Test
    void testExample4(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(0, solution.myAtoi("0-1"));
    }

    @Test
    void testExample5(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(0, solution.myAtoi("words and 987"));
    }

    @Test
    void testExample6(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(0, solution.myAtoi("-91283472332"));
    }

    @Test
    void testExample7(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(10, solution.myAtoi("010"));
    }

    @Test
    void testExample8(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(2147483647, solution.myAtoi("9223372036854775808"));
    }

    @Test
    void testExample9(){
        Q8_StringToInteger.Solution solution = new Q8_StringToInteger.Solution();
        assertEquals(2147483647, solution.myAtoi("2147483648"));
    }
}