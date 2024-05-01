package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@Category(value = QuestionCategory.GRAPH)
public class Q207_CourseSchedule {
    public static class Solution{
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            int[][] graph = new int[numCourses][numCourses];

            //draw
            drawGraph(prerequisites, graph);
            return solve(graph, numCourses);
        }

        private void drawGraph(int[][] prerequisites, int[][] graph){
            for (int[] prerequisite : prerequisites) {
                int from = prerequisite[0];
                int to = prerequisite[1];

                graph[to][from] = 1;
            }
        }

        private boolean solve(int[][] graph, int numCourses){
            Set<Integer> noCycle = new HashSet<>();

            for (int i = 0; i < numCourses; i++) {
                boolean[] visit = new boolean[numCourses];
                Queue<Integer> queue = new LinkedList<>();

                //start
                queue.add(i);
                while(!queue.isEmpty()){
                    Integer lecture = queue.poll();
                    visit[lecture] = true;

                    for (int toListen = 0; toListen < numCourses; toListen++) {
                        if(graph[lecture][toListen] == 0) continue; // no link
                        if(graph[lecture][toListen] == graph[toListen][lecture]) return false; // It's a simple loop
                        if(toListen == i) return false;
                        if(visit[toListen]) continue;

                        if(!noCycle.contains(toListen)) queue.add(toListen);
                    }
                }

                noCycle.add(i);
            }
            return true;
        }
    }
}
