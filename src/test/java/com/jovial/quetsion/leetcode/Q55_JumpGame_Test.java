package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q55_JumpGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q55_JumpGame_Test {
    @Test
    public void testExample_1(){
        Q55_JumpGame.Solution solution = new Q55_JumpGame.Solution();
        int[] nums = {2,3,1,1,4};
        Assertions.assertTrue(solution.canJump(nums));
    }

    @Test
    public void testExample_2(){
        Q55_JumpGame.Solution solution = new Q55_JumpGame.Solution();
        int[] nums = {3,2,1,0,4};
        Assertions.assertFalse(solution.canJump(nums));
    }

    @Test
    public void testExample_3(){
        Q55_JumpGame.Solution solution = new Q55_JumpGame.Solution();
        int[] nums = {2,0,0};
        Assertions.assertTrue(solution.canJump(nums));
    }
}
