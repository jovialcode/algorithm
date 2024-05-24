package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.List;

@Category(QuestionCategory.TRIE)
public class Q208_ImplementTrie {
    public static class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            insert(root, word, 0);
        }

        private void insert(TrieNode cur, String word, int index) {
            if (word.length() == index) {
                cur.isEnd = true;
                return;
            }

            int adjIndex = hasChar(cur, word.charAt(index));
            if (adjIndex != -1) {
                insert(cur.adj.get(adjIndex), word, index + 1);
            } else {
                TrieNode trieNode = new TrieNode(word.charAt(index));
                cur.adj.add(trieNode);
                insert(trieNode, word, index + 1);
            }
        }

        private int hasChar(TrieNode cur, Character character) {
            for (int i = 0; i < cur.adj.size(); i++) {
                if (cur.adj.get(i).val == character) {
                    return i;
                }
            }
            return -1;
        }

        public boolean search(String word) {
            return search(root, word, 0);
        }

        private boolean search(TrieNode cur, String word, int index) {
            if (word.length() == index) {
                return cur.isEnd;
            }

            int adjIndex = hasChar(cur, word.charAt(index));
            if (adjIndex == -1) {
                return false;
            } else {
                return search(cur.adj.get(adjIndex), word, index + 1);
            }
        }

        public boolean startsWith(String prefix) {
            return startsWith(root, prefix, 0);
        }

        private boolean startsWith(TrieNode cur, String prefix, int index) {
            if (prefix.length() == index) return true;

            int adjIndex = hasChar(cur, prefix.charAt(index));
            if (adjIndex == -1) {
                return false;
            } else {
                return startsWith(cur.adj.get(adjIndex), prefix, index + 1);
            }
        }


        private class TrieNode {
            public Character val;
            public boolean isEnd;
            public List<TrieNode> adj;

            public TrieNode() {
                this.adj = new ArrayList<>();
                this.isEnd = false;
            }

            public TrieNode(Character val) {
                this.val = val;
                this.adj = new ArrayList<>();
                this.isEnd = false;
            }
        }
    }
}
