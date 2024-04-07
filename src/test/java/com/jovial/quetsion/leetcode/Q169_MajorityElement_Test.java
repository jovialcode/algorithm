package com.jovial.quetsion.leetcode;


import com.jovial.question.leetcode.Q169_MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q169_MajorityElement_Test {

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
