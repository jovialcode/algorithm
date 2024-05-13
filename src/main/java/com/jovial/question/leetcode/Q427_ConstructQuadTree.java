package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.List;
import java.util.Optional;

@Category(QuestionCategory.DIVIDE_CONQUER)
public class Q427_ConstructQuadTree {
    public static class Solution {
        public Node construct(int[][] grid) {
            Node root = dfs(grid, new Pair(0, 0), new Pair(grid.length, grid.length));
            return root;
        }

        public Node dfs(int[][] grid, Pair start, Pair end){
            int val = grid[start.x][start.y];

            if(!divided(grid, start, end)){
                return new Node(val == 1, true);
            }

            Node node = new Node(val == 1, false);
            Optional<List<List<Pair>>> dividedGird = divideGird(start, end);
            if(dividedGird.isPresent()){
                List<List<Pair>> lists = dividedGird.get();
                for (int i = 0; i < lists.size(); i++) {
                    List<Pair> pairs = lists.get(i);
                    Pair nextStart = pairs.get(0);
                    Pair nextEnd = pairs.get(1);

                    Node dfs = dfs(grid, nextStart, nextEnd);

                    switch (i){
                        case 0: {
                            node.topLeft = dfs;
                            break;
                        }
                        case 1:{
                            node.bottomRight = dfs;
                            break;
                        }
                        case 2:{
                            node.topRight = dfs;
                            break;
                        }
                        case 3:{
                            node.bottomLeft = dfs;
                            break;
                        }
                    }

                }
            }

            return node;
        }

        public boolean divided(int[][] grid, Pair start, Pair end){
            if(start.x >= end.x) return false;
            if(end.x - start.x == 1 ) return false;

            int initValue = grid[start.x][start.y];
            for (int i = start.x; i < end.x; i++) {
                for (int j = start.y; j < end.y; j++) {
                    if(initValue != grid[i][j]){
                        return true;
                    }
                }
            }
            return false;
        }

        public Optional<List<List<Pair>>> divideGird(Pair start, Pair end) {
            if (start.x >= end.x) return Optional.empty();
            if (start.x - end.x == 1) return Optional.empty();
            int midX = (end.x + start.x) / 2;
            int midY = (end.y + start.y) / 2;

            List<List<Pair>> lists = List.of(
                List.of(new Pair(start.x, start.y), new Pair(midX, midY)), //topLeft
                List.of(new Pair(midX, midY), new Pair(end.x, end.y)), //bottomRight
                List.of(new Pair(start.x, midY), new Pair(midX, end.y)), //topRight
                List.of(new Pair(midX, start.y), new Pair(end.x, midY)) //bottomLeft
            );
            return Optional.of(lists);
        }

        class Pair {
            public int x;
            public int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        class Node {
            public boolean val;
            public boolean isLeaf;
            public Node topLeft;
            public Node topRight;
            public Node bottomLeft;
            public Node bottomRight;


            public Node() {
                this.val = false;
                this.isLeaf = false;
                this.topLeft = null;
                this.topRight = null;
                this.bottomLeft = null;
                this.bottomRight = null;
            }

            public Node(boolean val, boolean isLeaf) {
                this.val = val;
                this.isLeaf = isLeaf;
                this.topLeft = null;
                this.topRight = null;
                this.bottomLeft = null;
                this.bottomRight = null;
            }

            public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
                this.val = val;
                this.isLeaf = isLeaf;
                this.topLeft = topLeft;
                this.topRight = topRight;
                this.bottomLeft = bottomLeft;
                this.bottomRight = bottomRight;
            }
        }
    }
}
