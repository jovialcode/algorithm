package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q135_Candy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q135_Candy_Test {
    @Test
    void testExample_1(){
        int[] ratings = {1,0,2};
        Q135_Candy.Solution solution = new Q135_Candy.Solution();
        Assertions.assertEquals(5, solution.candy(ratings));
    }

    @Test
    void testExample_2(){
        int[] ratings = {1,2,2};
        Q135_Candy.Solution solution = new Q135_Candy.Solution();
        Assertions.assertEquals(4, solution.candy(ratings));
    }

    @Test
    void testExample_3(){
        int[] ratings = {1,0,2,1,3,2,1};
        Q135_Candy.Solution solution = new Q135_Candy.Solution();
        Assertions.assertEquals(12, solution.candy(ratings));
    }

    @Test
    void testExample_4(){
        int[] ratings = {1,2,87,87,87,2,1};
        Q135_Candy.Solution solution = new Q135_Candy.Solution();
        Assertions.assertEquals(13, solution.candy(ratings));
    }

    @Test
    void testExample_5(){
        int[] ratings = {1,3,4,5,2};
        Q135_Candy.Solution solution = new Q135_Candy.Solution();
        Assertions.assertEquals(11, solution.candy(ratings));
    }
}
