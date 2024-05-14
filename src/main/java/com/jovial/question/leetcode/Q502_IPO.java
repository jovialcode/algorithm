package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(QuestionCategory.HEAP)
public class Q502_IPO {
    public static class Solution {
        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            // input
            boolean[] visit = new boolean[profits.length];
            int minIndex = 0;
            List<Pair> projects = new ArrayList<>();
            for (int i = 0; i < profits.length; i++) {
                projects.add(new Pair(capital[i], profits[i]));
            }
            projects.sort(Comparator.comparingInt(project -> project.cost));
            //
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
            for (; minIndex < projects.size(); minIndex++) {
                Pair project = projects.get(minIndex);
                if(project.cost > w) break;
                priorityQueue.add(project.profit);
                visit[minIndex] = true;
            }

            int ans = w;
            while(!priorityQueue.isEmpty() && k-- > 0){
                int profit = priorityQueue.poll();
                ans += profit;

                for (; minIndex < projects.size(); minIndex++) {
                    Pair candidate = projects.get(minIndex);
                    if(visit[minIndex]) continue;
                    if(candidate.cost > ans) break;
                    visit[minIndex] = true;
                    priorityQueue.add(candidate.profit);
                }
            }
            return ans;
        }


        class Pair implements Comparable<Pair>{
            public int cost;
            public int profit;

            public Pair(int cost, int profit) {
                this.cost = cost;
                this.profit = profit;
            }

            @Override
            public int compareTo(Pair other) {
                return Integer.compare(other.profit, this.profit);
            }
        }
    }
}
