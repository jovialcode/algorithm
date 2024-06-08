package com.jovial.question.codetest;

import com.jovial.question.codetest.day240608.Question2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question12Test {
    @Test
    void testExample(){
        var grid = new String[]{
            "??b",
            "abc",
            "cc?"
        };
        Question2.Solution solution = new Question2.Solution();
        assertEquals(2, solution.solution(grid));
    }

    @Test
    void testExample2(){
        var grid = new String[]{
            "abcabcab",
            "????????",
        };
        Question2.Solution solution = new Question2.Solution();
        assertEquals(0, solution.solution(grid));
    }

    @Test
    void testExample3(){
        var grid = new String[]{
            "aa?",
        };
        Question2.Solution solution = new Question2.Solution();
        assertEquals(3, solution.solution(grid));
    }
}