package com.jovial.question.leetcode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q169_MajorityElementTest {

    @Test
    public void testExample_1(){
        Q169_MajorityElement.Solution solution = new Q169_MajorityElement.Solution();
        int[] nums = {3,2,3};
        Assertions.assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    public void testExample_2(){
        Q169_MajorityElement.Solution solution = new Q169_MajorityElement.Solution();
        int[] nums = {2,2,1,1,2,2};
        Assertions.assertEquals(2, solution.majorityElement(nums));
    }
}
