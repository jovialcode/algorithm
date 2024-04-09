package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q45_JumpGame2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q45_JumpGame2_Test {
    @Test
    public void testExample_1(){
        Q45_JumpGame2.Solution solution = new Q45_JumpGame2.Solution();
        int[] nums = {2,3,1,1,4};
        Assertions.assertEquals(2,solution.jump(nums));
    }

    @Test
    public void testExample_2(){
        Q45_JumpGame2.Solution solution = new Q45_JumpGame2.Solution();
        int[] nums = {2,3,0,1,4};
        Assertions.assertEquals(2,solution.jump(nums));
    }
}
