package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(value = QuestionCategory.GRAPH)
public class Q130_SurroundedRegions {
    public static class Solution {
        public static int[] moveX = {1, 0, -1, 0};
        public static int[] moveY = {0, 1, 0, -1};
        public final static int MAX_LENGTH = 201;

        public void solve(char[][] board) {
            for (int x = 1; x < board.length - 1; x++) {
                for (int y = 1; y < board[x].length - 1; y++) {
                    if (board[x][y] == 'O')
                        flip(board, x, y);
                }
            }
        }

        private void flip(char[][] board, int x, int y) {
            boolean[][] visit = new boolean[MAX_LENGTH][MAX_LENGTH];
            boolean result = bfs(board, visit, x, y);

            for (int i = 1; i < board.length - 1; i++) {
                for (int j = 1; j < board[i].length - 1; j++) {
                    if (board[i][j] == 'C')
                        if (result) board[i][j] = 'X';
                        else board[i][j] = 'O';
                }
            }
        }

        private boolean bfs(char[][] board, boolean[][] visit, int x, int y) {
            if (border(board, x, y) && board[x][y] == 'O') return false;

            board[x][y] = 'C';
            visit[x][y] = true;
            boolean ans = true;
            for (int i = 0; i < 4; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if (nextX < 0 || nextY < 0 || nextX == board.length || nextY == board[0].length) continue;
                if (visit[nextX][nextY]) continue;
                if (board[nextX][nextY] == 'O') {
                    ans = ans & bfs(board, visit, nextX, nextY);
                }
            }

            return ans;
        }

        private boolean border(char[][] board, int x, int y) {
            return x == 0 || y == 0 || x == board.length - 1 || y == board[0].length - 1;
        }
    }
}
