package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(value = QuestionCategory.GRAPH)
public class Q200_NumberOfIslands {
    public static class Solution{
        public static int[] moveX = {1,0,-1,0};
        public static int[] moveY = {0,1,0,-1};

        public int numIslands(char[][] grid) {
            final int MAX_LENGTH = 301;
            boolean[][] visit = new boolean[MAX_LENGTH][MAX_LENGTH];

            int ans = 0;
            for (int x = 0; x < grid.length ; x++) {
                for (int y = 0; y < grid[x].length; y++) {
                    if(visit[x][y]) continue;

                    if(grid[x][y] == '1') {
                        ans += 1;
                        bfs(grid, visit, x, y);
                    }
                }
            }

            return ans;
        }

        public void bfs(char[][] grid, boolean[][]visit, int x, int y){
            if(visit[x][y]) return;
            visit[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if( nextX < 0 || nextY < 0 || nextX == grid.length || nextY == grid[0].length) continue;
                if( grid[nextX][nextY] == '0') continue;

                bfs(grid, visit, nextX, nextY);
            }
        }
    }
}
