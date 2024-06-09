package com.jovial.question.codetest.day240609;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    @Test
    void testExample() {
        var leave = 4;
        var day = "FRI";
        var holidays = new int[]{6, 21, 23, 27, 28};

        Question2 question2 = new Question2();
        assertEquals(10, question2.solution(leave, day, holidays));
    }

    @Test
    void testExample2() {
        var leave = 3;
        var day = "SUN";
        var holidays = new int[]{2, 6, 17, 29};

        Question2 question2 = new Question2();
        assertEquals(8, question2.solution(leave, day, holidays));
    }

    @Test
    void testExample3() {
        var leave = 30;
        var day = "MON";
        var holidays = new int[]{1, 2, 3, 4, 28, 29, 30};

        Question2 question2 = new Question2();
        assertEquals(30, question2.solution(leave, day, holidays));
    }
}