package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q42_TrappingRainWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q42_TrappingRainWater_Test {
    @Test
    void testExample_1(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(6, solution.trap(height));
    }

    @Test
    void testExample_2(){
        int[] height = {4,2,0,3,2,5};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(9, solution.trap(height));
    }

    @Test
    void testExample_3(){
        int[] height = {2,0,2};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(2, solution.trap(height));
    }

    @Test
    void testExample_4(){
        int[] height = {5,4,1,2};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(1, solution.trap(height));
    }

    @Test
    void testExample_5(){
        int[] height = {9,6,8,8,5,6,3};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(3, solution.trap(height));
    }

    @Test
    void testExample_6(){
        int[] height = {8,5,4,1,8,9,3,0,0};
        Q42_TrappingRainWater.Solution solution = new Q42_TrappingRainWater.Solution();
        Assertions.assertEquals(14, solution.trap(height));
    }
}
