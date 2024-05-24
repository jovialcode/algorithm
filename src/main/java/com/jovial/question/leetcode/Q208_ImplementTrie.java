package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Category(QuestionCategory.TRIE)
public class Q208_ImplementTrie {
    public static class Trie {
        private TrieNode root;
        private Set<String> words;

        public Trie() {
            root = new TrieNode();
            words = new HashSet<>();
        }

        public void insert(String word) {
            words.add(word);
            insert(root, word, 0);
        }

        private void insert(TrieNode cur, String word, int index) {
            if (word.length() == index) return;

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
            return words.contains(word);
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
            public List<TrieNode> adj;

            public TrieNode() {
                this.adj = new ArrayList<>();
            }

            public TrieNode(Character val) {
                this.val = val;
                this.adj = new ArrayList<>();
            }
        }
    }
}
