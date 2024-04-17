package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(value = QuestionCategory.GREEDY)
public class Q135_Candy {
    public static class Solution{
        public int candy(int[] ratings) {
            int[] candies = new int[ratings.length];

            candies[0] = 1;
            for (int i = 1; i < ratings.length; i++) {
                if(ratings[i] > ratings[i-1]){
                    candies[i] = candies[i-1] + 1;
                }else {
                    candies[i] = 1;
                }

                if(ratings[i] < ratings[i-1]) {
                    backStep(ratings, candies, i);
                }
            }
            return Arrays.stream(candies)
                    .sum();
        }

        private void backStep(int[] ratings, int[] candies, int current){
            for (int i = current; i > 0; i--) {
                if(ratings[i-1] <= ratings[i]) return;
                if(candies[i] >= candies[i-1]){
                    candies[i -1] += 1;
                }
            }
        }
    }
}
