package com.jovial.question.codetest;

import org.junit.jupiter.api.Test;

class Question13Test {
    @Test
    void testExample(){
        Question3.Solution solution = new Question3.Solution();
        var map3d = new String[][]{
            {"XXXXX", "OOSXO", "OOXOO"},
            {"XEOOO", "OXXXO", "OOOOX"}
        };

        assertEquals(13, solution.solution(map3d));
    }

    @Test
    void testExample2(){
        Question3.Solution solution = new Question3.Solution();
        var map3d = new String[][]{
            {"SOXX", "OOXX"},
            {"XXOO", "XXOE"},
        };

        assertEquals(-1, solution.solution(map3d));
    }
}