package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Category(QuestionCategory.TRIE)
public class Q212_WordSearch2 {
    public static class Solution {
        public static int[] moveX = new int[]{1, -1, 0, 0};
        public static int[] moveY = new int[]{0, 0, 1, -1};

        public List<String> findWords(char[][] board, String[] words) {
            // draw Trie;
            Trie trie = new Trie();
            for (String word : words) {
                drawTrie(trie, word);
            }


            List<String> ans = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (Objects.isNull(trie.root.adj[board[i][j] - 'a'])) continue;
                    boolean[][] visit = new boolean[board.length][board[0].length];
                    visit[i][j] = true;
                    dfs(board, i, j, trie.root.adj[board[i][j] - 'a'], visit, ans);
                }
            }
            return ans;
        }

        private void dfs(char[][] board, int x, int y, TrieNode cur, boolean[][] visit, List<String> ans) {
            if (!Objects.isNull(cur.word)) {
                ans.add(cur.word);
                cur.word = null;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if (nextX < 0 || nextY < 0 | nextX == board.length || nextY == board[0].length) continue;
                if (visit[nextX][nextY]) continue;

                char letter = board[nextX][nextY];
                if (Objects.isNull(cur.adj[letter - 'a'])) continue;

                visit[nextX][nextY] = true;
                dfs(board, nextX, nextY, cur.adj[letter - 'a'], visit, ans);
                visit[nextX][nextY] = false;
            }
        }


        private void drawTrie(Trie trie, String word) {
            trie.insert(word);
        }

        private class Trie {
            public TrieNode root;

            public Trie() {
                this.root = new TrieNode();
            }

            public void insert(String word) {
                TrieNode node = root;
                for (char c : word.toCharArray()) {
                    int index = c - 'a';
                    if (Objects.isNull(node.adj[index])) {
                        node.adj[index] = new TrieNode();
                    }
                    node = node.adj[index];
                }
                node.word = word;
            }
        }

        private class TrieNode {
            public String word = null;
            public TrieNode[] adj = new TrieNode[26];
        }
    }
}
