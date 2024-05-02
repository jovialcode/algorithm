package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;
import java.util.List;

@Category(value = QuestionCategory.BFS)
public class Q909_SnakesAndLadders {
    public static class Solution{
        public int snakesAndLadders(int[][] board) {
            final int finish = board.length * board.length;
            int[] visit = new int[finish + 1];
            Arrays.fill(visit, 1001);

            visit[1] = 0;
            bfs(board, visit, 1);

            return visit[finish] == 1001 ? -1 : visit[finish];
        }

        public void bfs(int[][] board, int[] visit, int current){
            int finish = board.length * board.length;
            if(current == finish) return;

            for (int i = 1; i <= 6 ; i++) {
                int next = current + i;

                List<Integer> integers = boardMove(board.length, next);
                int x = integers.get(0);
                int y = integers.get(1);

                if(board[x][y] != -1)
                    next = board[x][y];

                if(next > finish) continue;
                if(visit[next] > visit[current] + 1){
                    visit[next] = visit[current] + 1;
                    bfs(board, visit, next);
                }
            }
        }

        public List<Integer> boardMove(final int boardSize, int jump){
            if(jump >= boardSize * boardSize) jump = boardSize * boardSize;

            int nextX = boardSize - 1 - (jump -1) / boardSize;
            int nextY = (nextX % 2 != boardSize % 2) ? (jump - 1) % boardSize : (boardSize -1) - (jump-1) % boardSize;

            return List.of(nextX, nextY);
        }
    }
}
