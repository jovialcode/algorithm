package com.jovial.question.codetest.day240608;

import java.util.Deque;
import java.util.LinkedList;

public class Question3 {
    public static class Solution {
        private int[] moveZ = {1, -1, 0, 0, 0, 0};
        private int[] moveX = {0, 0, 0, 0, 1, -1};
        private int[] moveY = {0, 0, 1, -1, 0, 0};

        public int solution(String[][] map3d) {
            int[][][] board = new int[map3d.length][map3d[0].length][];

            Coordination start = null;
            Coordination end = null;
            for (int z = 0; z < map3d.length; z++) {
                for (int x = 0; x < map3d[z].length; x++) {
                    String s = map3d[z][x];
                    board[z][x] = new int[s.length()];
                    for (int y = 0; y < s.length(); y++) {
                        char letter = s.charAt(y);
                        if (letter != 'X') board[z][x][y] = 1;

                        if (letter == 'S') start = new Coordination(z, x, y);
                        if (letter == 'E') end = new Coordination(z, x, y);
                    }
                }
            }

            boolean[][][] visit = new boolean[board.length][board[0].length][board[0][0].length];
            int[][][] distance = new int[board.length][board[0].length][board[0][0].length];
            Deque<Coordination> queue = new LinkedList<>();
            queue.offer(start);

            while (!queue.isEmpty()) {
                Coordination cur = queue.poll();

                if (cur.z == end.z && cur.x == end.x && cur.y == end.y) {
                    return distance[end.z][end.x][end.y];
                }

                visit[cur.z][cur.x][cur.y] = true;

                for (int i = 0; i < 6; i++) {
                    int nextZ = cur.z + moveZ[i];
                    int nextX = cur.x + moveX[i];
                    int nextY = cur.y + moveY[i];

                    if (nextZ < 0 || nextX < 0 || nextY < 0 ||
                        nextZ > board.length - 1 || nextX > board[0].length - 1 || nextY > board[0][0].length - 1) {
                        continue;
                    }

                    if (visit[nextZ][nextX][nextY]) continue;
                    if (board[nextZ][nextX][nextY] == 0) continue;

                    if(distance[nextZ][nextX][nextY] == 0 ||
                        distance[nextZ][nextX][nextY] > distance[cur.z][cur.x][cur.y] + 1){
                        distance[nextZ][nextX][nextY] = distance[cur.z][cur.x][cur.y] + 1;
                        queue.offer(new Coordination(nextZ, nextX, nextY));
                    }
                }
            }

            return -1;
        }

        private class Coordination {
            int z; // 층
            int x; //
            int y; //

            public Coordination(int z, int x, int y) {
                this.z = z;
                this.x = x;
                this.y = y;
            }
        }
    }
}
