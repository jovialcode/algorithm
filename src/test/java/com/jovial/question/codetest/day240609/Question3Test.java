package com.jovial.question.codetest.day240609;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {
    @Test
    void testExample() {
        var height = 10;
        var trails = new int[][]{
            {1, 2}, {2, 3}, {3, 5}, {3, 5}, {1, 4}, {6, 6}, {2, 4}, {8, 4}, {12, 7}, {12, 7}, {1, 3}
        };
        var signs = new int[]{8, 2, 10};
        Question3 question3 = new Question3();
        assertEquals(10, question3.solution(height, trails, signs));

    }

    @Test
    void testExample2() {
        var height = 7;
        var trails = new int[][]{
            {1, 1}, {2, 3}, {3, 3}, {2, 3}, {5, 3}, {2, 3}, {7, 3}, {1, 4}, {9, 3}, {9, 3}
        };
        var signs = new int[]{3, 6};
        Question3 question3 = new Question3();
        assertEquals(6, question3.solution(height, trails, signs));

    }
}