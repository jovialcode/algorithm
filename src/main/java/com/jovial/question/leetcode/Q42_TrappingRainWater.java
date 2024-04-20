package com.jovial.question.leetcode;

public class Q42_TrappingRainWater {
    public static class Solution{
        public int trap(int[] height){
            return solve(height,  0, height.length - 1);
        }

        private int solve(int[] height, int left, int right){
            if (left >= right) return 0;

            // left max
            int leftMax = findMaxHeight(height, left, right, true);
            int rightMax = findMaxHeight(height, right, leftMax, false);

            if(leftMax >= rightMax) return 0;

            int water = calWater(height, leftMax, rightMax);
            return water + solve(height, left, leftMax) + solve(height, rightMax, right);
        }

        private int calWater(int[] height, int leftMax, int rightMax){
            int minHeight = Math.min(height[leftMax], height[rightMax]);
            int water = minHeight * (rightMax - leftMax + 1);
            for (int i = leftMax; i <= rightMax; i++) {
                if(height[i] >= minHeight) water -= minHeight;
                else water -= height[i];
            }
            return water;
        }

        private int findMaxHeight(int[] height,final int from, final int limit, boolean upper){
            int maxIndex = from;
            int temp = 0;

            if(upper){
                for (int l = from; l < limit; l++) {
                    if(height[l] > temp){
                        temp = height[l];
                        maxIndex = l;
                    }
                }
            }else{
                for (int r = from; r >  limit; r--) {
                    if(height[r] >= temp){
                        temp = height[r];
                        maxIndex = r;
                    }
                }
            }

            return maxIndex;
        }
    }
}
