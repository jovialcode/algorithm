package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.ARRAY)
public class Q48_RotateImage {
    public static class Solution {
        public void rotate(int[][] matrix) {
            boolean[][] visit = new boolean[matrix.length][matrix.length];


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (visit[i][j]) continue;
                    rotate(matrix, visit, i, j, matrix[i][j]);
                }
            }
        }

        private void rotate(int[][] matrix, boolean[][] visit, int x, int y, int value) {
            if (visit[x][y]) return;
            visit[x][y] = true;

            int nextX = y;
            int nextY = (matrix.length - 1) - x;

            int temp = matrix[nextX][nextY];
            matrix[nextX][nextY] = value;
            rotate(matrix, visit, nextX, nextY, temp);
        }
    }
}
