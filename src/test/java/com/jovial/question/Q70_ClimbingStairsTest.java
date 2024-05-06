package com.jovial.question;

import com.jovial.question.leetcode.Q70_ClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q70_ClimbingStairsTest {
    @Test
    void testExample1(){
        Q70_ClimbingStairs.Solution solution = new Q70_ClimbingStairs.Solution();
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void testExample2(){
        Q70_ClimbingStairs.Solution solution = new Q70_ClimbingStairs.Solution();
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void testExample3(){
        Q70_ClimbingStairs.Solution solution = new Q70_ClimbingStairs.Solution();
        assertEquals(1, solution.climbStairs(1));
    }
}