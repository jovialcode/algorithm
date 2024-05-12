package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.BACKTRACKING)
public class Q79_WordSearch {
    public static class Solution {
        public static int[] moveX = {1, 0, -1, 0};
        public static int[] moveY = {0, 1, 0, -1};

        public boolean exist(char[][] board, String word) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(board[i][j] == word.charAt(0)){
                        boolean[][] visit = new boolean[7][7];
                        StringBuilder ans = new StringBuilder();
                        visit[i][j] = true;
                        ans.append(board[i][j]);
                        if(dfs(board, visit, i, j, word, ans)) return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(char[][] board, boolean[][] visit, int x, int y, String word, StringBuilder sol) {
            if(word.equals(sol.toString())) return true;

            for (int i = 0; i < 4; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if(nextX == board.length
                    || nextY == board[0].length
                    || nextX < 0
                    || nextY < 0) continue;
                if(visit[nextX][nextY]) continue;

                int index = sol.length();
                char token = board[nextX][nextY];

                if(word.charAt(index) == token){
                    visit[nextX][nextY] = true;
                    sol.append(token);
                    if(dfs(board, visit, nextX, nextY, word, sol)) return true;
                    sol.deleteCharAt(index);
                    visit[nextX][nextY] = false;
                }
            }

            return false;
        }
    }
}
