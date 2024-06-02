package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.DP)
public class Q62_UniquePath {
    public static class Solution {
        public int[] moveX = new int[]{0, 1};
        public int[] moveY = new int[]{1, 0};

        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m + 1][n + 1];

            for (int i = 0; i < m; i++) {
                Arrays.fill(dp[i], -1);
            }
            return sol(m, n, dp, 0, 0);
        }

        private int sol(int targetX, int targetY, int[][] dp, int x, int y) {
            if (x == targetX - 1 && y == targetY - 1) {
                return 1;
            }
            if (dp[x][y] != -1) return dp[x][y];

            int ans = 0;
            for (int i = 0; i < 2; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if (nextX > targetX || nextY > targetY) continue;
                ans += sol(targetX, targetY, dp, nextX, nextY);
            }
            return dp[x][y] = ans;
        }
    }
}
