package com.jovial.question.codetest.day240608;

import java.util.*;

public class Question2 {
    public static class Solution {
        private int[] moveX = {0, 0, -1, 1};
        private int[] moveY = {1, -1, 0, 0};
        private char[] alpha = {'a', 'b', 'c'};

        public int solution(String[] grid) {
            //
            List<Pair> questions = new ArrayList<>();
            char[][] board = new char[grid.length][];
            for (int i = 0; i < grid.length; i++) {
                String s = grid[i];
                board[i] = new char[s.length()];
                for (int j = 0; j < s.length(); j++) {
                    board[i][j] = s.charAt(j);
                    if (board[i][j] == '?') {
                        questions.add(new Pair(i, j));
                    }
                }
            }
            //
            return solve(board, questions, 0);
        }

        private int solve(char[][] board, List<Pair> questions, int index) {
            if (index == questions.size()) {
                if (isAnswer(board))
                    return 1;
                else
                    return 0;
            }

            int ans = 0;
            int x = questions.get(index).x;
            int y = questions.get(index).y;

            for (char c : alpha) {
                board[x][y] = c;
                ans += solve(board, questions, index + 1);
                board[x][y] = '?';
            }

            return ans;
        }

        private boolean isAnswer(char[][] board) {
            boolean[][] visit = new boolean[board.length][board[0].length];
            Set<Character> visitAlpha = new HashSet<>();
            Deque<Pair> queue = new LinkedList<>();

            queue.add(new Pair(0, 0));
            visitAlpha.add(board[0][0]);
            while (!queue.isEmpty()) {
                Pair poll = queue.poll();

                int curX = poll.x;
                int curY = poll.y;
                visit[curX][curY] = true;

                for (int i = 0; i < 4; i++) {
                    int nextX = curX + moveX[i];
                    int nextY = curY + moveY[i];

                    if (nextX < 0 || nextY < 0 || nextX > board.length - 1 || nextY > board[0].length - 1) continue;
                    if (visit[nextX][nextY]) continue;

                    char boardLetter = board[nextX][nextY];
                    if (board[curX][curY] == boardLetter){
                        queue.add(new Pair(nextX, nextY));
                    }else{
                        if(!visitAlpha.contains(boardLetter)){
                            queue.addLast(new Pair(nextX, nextY));
                            visitAlpha.add(boardLetter);
                        }
                    }
                }
            }

            for (int i = 0; i < visit.length; i++) {
                for (int j = 0; j < visit[0].length; j++) {
                    if(!visit[i][j]) return false;
                }
            }

            return true;
        }

        private class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
    }
}
