package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(value = QuestionCategory.DFS)
public class Q433_MinimumGeneticMutation {
    public static class Solution{
        public int minMutation(String startGene, String endGene, String[] bank) {
            Node start = new Node(startGene);
            ArrayList<Node> genes = new ArrayList<>();
            draw(start, genes, startGene, bank);

            //
            Set<String> visit = new HashSet<>();
            int shortest = dfs(start, visit, endGene, 0);
            return shortest == 999 ? -1: shortest;
        }

        private int dfs(Node cur, Set<String> visit, String endGame, int cnt){
            if(cur.val.equals(endGame)) {
                return cnt;
            };

            visit.add(cur.val);
            int shortest = 999;
            for (Node adj : cur.adjs) {
                if (!visit.contains(adj.val)) {
                    int pathLength = dfs(adj, visit, endGame, cnt + 1);
                    shortest = Math.min(shortest, pathLength);
                }
            }
            visit.remove(cur.val);
            return shortest;
        }

        private void draw(Node start, ArrayList<Node> genes, String startGene, String[] bank){
            for (int i = 0; i < bank.length; i++) {
                String gene = bank[i];
                Node geneNode = new Node(gene);
                genes.add(geneNode);

                if(mutation(startGene, gene)){
                    start.adjs.add(geneNode);
                }
            }

            for (int i = 0; i < bank.length; i++) {
                String aGene = bank[i];
                for (int j = i + 1; j < bank.length; j++) {
                    String bGene = bank[j];

                    if(mutation(aGene, bGene)){
                        Node aNode = genes.get(i);
                        Node bNode = genes.get(j);

                        aNode.adjs.add(bNode);
                        bNode.adjs.add(aNode);
                    }
                }
            }
        }

        private boolean mutation(String a, String b){
            int cnt = 0;
            for (int i = 0; i < 8; i++)
                if(a.charAt(i) != b.charAt(i)) cnt += 1;

            return cnt == 1;
        }

        class Node {
            public String val;
            public List<Node> adjs;

            public Node() {
                adjs = new ArrayList<>();
            }
            public Node(String _val) {
                val = _val;
                adjs = new ArrayList<>();
            }
        };
    }
}
