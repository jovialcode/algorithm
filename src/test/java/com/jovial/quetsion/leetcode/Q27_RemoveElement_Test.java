package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q27_RemoveElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q27_RemoveElement_Test {

    @Test
    public void testExample_1(){
        Q27_RemoveElement.Solution solution = new Q27_RemoveElement.Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int answer = solution.removeElement(nums, val);

        Assertions.assertEquals(2, answer);
    }

    @Test
    public void testExample_2() {
        Q27_RemoveElement.Solution solution = new Q27_RemoveElement.Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int answer = solution.removeElement(nums, val);

        Assertions.assertEquals(5, answer);
    }
}
