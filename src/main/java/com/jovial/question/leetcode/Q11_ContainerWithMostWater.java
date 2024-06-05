package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.GREEDY)
public class Q11_ContainerWithMostWater {
    public static class Solution {
        public int maxArea(int[] height) {
            int from = 0;
            int end = height.length - 1;

            int total = amount(height, from, end);
            while (from <= end) {

                boolean stale = true;
                if (height[from] < height[end]) {
                    for (int i = from + 1; i < end; i++) {
                        if (height[from] <= height[i]) {
                            from = i;
                            stale = false;
                            break;
                        }
                    }
                } else {
                    for (int i = end - 1; i > from; i--) {
                        if (height[end] <= height[i]) {
                            end = i;
                            stale = false;
                            break;
                        }
                    }
                }
                if (stale) break;
                total = Math.max(total, amount(height, from, end));

            }
            return total;
        }


        private int amount(int[] height, int from, int end) {
            int width = end - from;
            int minHeight = Math.min(height[from], height[end]);
            return width * minHeight;
        }
    }
}
