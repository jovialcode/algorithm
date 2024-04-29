package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Category(value = QuestionCategory.GRAPH)
public class Q133_CloneGraph {
    public static class Solution{
        private final int MAX_RANGE = 102;

        public Node cloneGraph(Node node) {
            if(Objects.isNull(node)) return null;
            final boolean[] visit = new boolean[MAX_RANGE];
            List<List<Integer>> lists = describeGraph(node, visit);
            int range = maxRange(visit);


            List<Node> cloneNodes = IntStream
                    .rangeClosed(1, range)
                    .mapToObj(Node::new)
                    .collect(Collectors.toList());

            for (int i = 1; i <= range; i++) {
                List<Integer> neighbors = lists.get(i);
                Node cloneNode = cloneNodes.get(i - 1);

                for(Integer neighbor: neighbors){
                    cloneNode.neighbors.add(cloneNodes.get(neighbor - 1));
                }
            }
            return cloneNodes.get(0);
        }

        private List<List<Integer>> describeGraph(Node root, boolean[] visit){
            final List<List<Integer>> graph = new ArrayList<>(MAX_RANGE);
            for (int i = 0; i < MAX_RANGE; i++) {
                graph.add(new ArrayList<>());
            }

            final Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                int currentVal = current.val;

                if(visit[current.val]) continue;
                visit[current.val] = true;

                for (Node adjNode : current.neighbors) {
                    graph.get(currentVal).add(adjNode.val);

                    if(!visit[adjNode.val]){
                        queue.add(adjNode);
                    }
                }
            }
            return graph;
        }

        private int maxRange(boolean[] visit){
            int range = 0;
            for (int i = 1; i < visit.length; i++) {
                if(visit[i]) range = Math.max(range, i);
            }
            return range;
        }
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
