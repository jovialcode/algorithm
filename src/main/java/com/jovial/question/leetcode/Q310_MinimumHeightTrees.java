package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.common.annotation.Explanation;

import java.util.*;

@Category(QuestionCategory.BFS)
public class Q310_MinimumHeightTrees {
    public static class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<List<Integer>> nodes = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                List<Integer> node = new ArrayList<>();
                nodes.add(node);
            }

            //
            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0];
                int b = edges[i][1];

                nodes.get(a).add(b);
                nodes.get(b).add(a);
            }

            List<Integer> height = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int[] visit = new int[n];
                Arrays.fill(visit, 2 * 10001);
                Deque<Integer> deque = new LinkedList<>();
                deque.add(i);
                visit[i] = 0;
                while (!deque.isEmpty()) {
                    Integer poll = deque.poll();

                    List<Integer> node = nodes.get(poll);
                    for (Integer adj : node) {
                        if (visit[adj] > visit[poll] + 1) {
                            visit[adj] = visit[poll] + 1;
                            deque.offer(adj);
                        }
                    }
                }

                height.add(Arrays.stream(visit).max().getAsInt());
            }

            Integer min = height.stream().min(Integer::compareTo).orElse(-1);
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < height.size(); i++) {
                if (Objects.equals(height.get(i), min)) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }

    @Explanation("remove leafs and bfs")
    public static class TopologySolution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            if (n == 1) {
                return Collections.singletonList(0);
            }

            List<List<Integer>> nodes = new ArrayList<>();
            int[] degree = new int[n];

            for (int i = 0; i < n; i++) {
                List<Integer> node = new ArrayList<>();
                nodes.add(node);
            }

            //
            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0];
                int b = edges[i][1];

                nodes.get(a).add(b);
                nodes.get(b).add(a);

                degree[a]++;
                degree[b]++;
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (degree[i] == 1) {
                    queue.add(i);
                }
            }
            int remainNode = n;
            while ((remainNode -= queue.size()) > 0) {
                int leafSize = queue.size();
                for (int i = 0; i < leafSize; i++) {
                    Integer node = queue.poll();

                    for (Integer adj : nodes.get(node)) {
                        degree[adj]--;

                        if (degree[adj] == 1)
                            queue.add(adj);
                    }
                }
            }

            return new ArrayList<>(queue);
        }
    }
}
