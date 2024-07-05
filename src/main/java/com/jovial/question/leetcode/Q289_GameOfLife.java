package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@Category(QuestionCategory.ARRAY)
public class Q289_GameOfLife {
    public static class Solution {
        public static int[] moveX = {0, 0, -1, 1, -1, -1, 1, 1};
        public static int[] moveY = {1, -1, 0, 0, -1, 1, -1, 1};

        public void gameOfLife(int[][] board) {

            int n = board.length;
            int m = board[0].length;

            int[][] nextGen = new int[n][m];

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    int lives = 0;

                    for (int i = 0; i < 8; i++) {
                        int nextX = x + moveX[i];
                        int nextY = y + moveY[i];

                        if (nextX < 0 || nextY < 0 || nextX == board.length || nextY == board[0].length) continue;

                        if (board[nextX][nextY] == 1) lives++;
                    }

                    if (board[x][y] == 0) {
                        nextGen[x][y] = isLive(lives, (num) -> num == 3) ? 1 : 0;
                    } else {
                        if (lives < 2) nextGen[x][y] = isLive(lives, (num) -> num < 2) ? 0 : 1;
                        else if (lives == 2 || lives == 3)
                            nextGen[x][y] = isLive(lives, (num) -> num == 2 || num == 3) ? 1 : 0;
                        else nextGen[x][y] = isLive(lives, (num) -> num > 3) ? 0 : 1;
                    }
                }
            }

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    board[x][y] = nextGen[x][y];
                }
            }
        }

        private boolean isLive(int num, Predicate<Integer> predict) {
            return predict.test(num);
        }
    }
}
