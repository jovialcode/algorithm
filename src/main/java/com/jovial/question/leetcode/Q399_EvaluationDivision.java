package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(value = QuestionCategory.GRAPH)
public class Q399_EvaluationDivision {
    public static class Solution{
        final int MAX_LENGTH = 41;
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            final double[][] edges = new double[MAX_LENGTH][MAX_LENGTH];
            final Map<String, Integer> nodeMap = new HashMap<>();

            // draw edges
            for (int i = 0; i < equations.size(); i++) {
                List<String> link = equations.get(i);
                String from = link.get(0);
                String to = link.get(1);
                double val = values[i];

                int fromIndex = putNodeIndex(nodeMap, from);
                int toIndex = putNodeIndex(nodeMap, to);

                edges[fromIndex][toIndex] = val;
                edges[fromIndex][fromIndex] = 1.0;
                edges[toIndex][fromIndex] = 1/val;
                edges[toIndex][toIndex] = 1.0;
            }

            // evaluate
            evaluate(edges, nodeMap.size());

            // query answer
            double[] ans = new double[queries.size()];
            for (int i = 0; i < queries.size(); i++) {
                List<String> link = queries.get(i);
                String from = link.get(0);
                String to = link.get(1);

                int fromIndex = getNodeIndex(nodeMap, from);
                int toIndex = getNodeIndex(nodeMap, to);

                ans[i] = query(edges, fromIndex, toIndex);
            }
            return ans;
        }

        private double query(double[][] edges, int fromIndex, int toIndex){
            if (fromIndex == -1 || toIndex == -1) return -1.0;
            return edges[fromIndex][toIndex] == 0.0 ? -1.0: edges[fromIndex][toIndex];
        }

        private void evaluate(double[][] edges, int maxSize){
            for (int k = 0; k < maxSize; k++) {
                for (int j = 0; j < maxSize; j++) {
                    for (int i = 0; i < maxSize; i++){
                        if(i == k || j == k || i == j) continue;
                        if(edges[i][k] > 0.0 && edges[k][j] > 0.0)
                            edges[i][j] = edges[i][k] * edges[k][j];
                    }
                }
            }
        }

        private int putNodeIndex(Map<String, Integer> nodeMap, String key){
            Integer orDefault = nodeMap.getOrDefault(key, nodeMap.size());
            nodeMap.put(key, orDefault);
            return orDefault;
        }

        private int getNodeIndex(Map<String, Integer> nodeMap, String key){
            return nodeMap.getOrDefault(key, -1);
        }
    }
}
