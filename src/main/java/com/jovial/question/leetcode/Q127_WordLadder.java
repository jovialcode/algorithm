package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(QuestionCategory.BFS)
public class Q127_WordLadder {
    public static class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            //
            Map<String, Node> graph = new HashMap<>();
            List<String> mutableList = new ArrayList<>(wordList);
            if(!mutableList.contains(beginWord)) mutableList.add(0, beginWord);
            drawGraph(mutableList, graph);
            //
            Set<String> visit = new HashSet<>();
            Deque<Node> queue = new LinkedList<>();
            Node startNode = graph.get(beginWord);
            startNode.visit = 1;
            queue.add(startNode);
            visit.add(beginWord);
            //
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (current.val.equals(endWord)) {
                    return current.visit;
                };

                for (Node adj : current.adj) {
                    if (visit.contains(adj.val)) continue;
                    queue.offer(adj);
                    visit.add(adj.val);
                    adj.visit = current.visit + 1;
                }
            }

           return 0;
        }

        private void drawGraph(List<String> wordList, Map<String, Node> graph) {
            //
            for (int i = 0; i < wordList.size(); i++) {
                if(graph.containsKey(wordList.get(i))) continue;
                graph.put(wordList.get(i), new Node(wordList.get(i)));
            }

            //
            for (int i = 0; i < graph.size(); i++) {
                Node wordA = graph.get(wordList.get(i));
                for (int j = i + 1; j < wordList.size(); j++) {
                    Node wordB = graph.get(wordList.get(j));
                    if (oneWordDiff(wordA.val, wordB.val)) {
                        wordA.adj.add(wordB);
                        wordB.adj.add(wordA);
                    }
                }
            }
        }

        private boolean oneWordDiff(String a, String b) {
            int cnt = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) cnt += 1;
                if (cnt == 2) return false;
            }
            return cnt == 1;
        }

        private class Node {
            public String val;
            public List<Node> adj;
            public int visit;

            public Node(String val) {
                this.val = val;
                this.adj = new ArrayList<>();
                this.visit = 0;
            }
        }
    }
}
