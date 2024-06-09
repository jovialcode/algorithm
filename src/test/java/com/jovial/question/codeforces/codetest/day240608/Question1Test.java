package com.jovial.question.codeforces.codetest.day240608;

import com.jovial.question.codetest.day240608.Question1;
import org.junit.jupiter.api.Test;

class Question1Test {
    @Test
    void testExample1(){
        var s = "1234";
        var op = "+";
        Question1.Solution solution = new Question1.Solution();
        solution.solution(s, op);
    }

    @Test
    void testExample2(){
        var s = "987987";
        var op = "-";
        Question1.Solution solution = new Question1.Solution();
        solution.solution(s, op);
    }

    @Test
    void testExample3(){
        var s = "31402";
        var op = "*";
        Question1.Solution solution = new Question1.Solution();
        solution.solution(s, op);
    }
}