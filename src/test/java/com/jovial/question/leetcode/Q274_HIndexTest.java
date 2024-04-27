package com.jovial.question.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q274_HIndexTest {
    @Test
    public void testExample_1(){
        int[] nums ={3,0,6,1,5};
        Q274_HIndex.Solution solution = new Q274_HIndex.Solution();
        Assertions.assertEquals(3, solution.hIndex(nums));
    }

    @Test
    public void testExample_2(){
        int[] nums ={1,3,1};
        Q274_HIndex.Solution solution = new Q274_HIndex.Solution();
        Assertions.assertEquals(1, solution.hIndex(nums));
    }
}
