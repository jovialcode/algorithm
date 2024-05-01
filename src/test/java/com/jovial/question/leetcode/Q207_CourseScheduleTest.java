package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q207_CourseScheduleTest {
    @Test
    void testExample_1(){
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        Q207_CourseSchedule.Solution solution = new Q207_CourseSchedule.Solution();
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void testExample_2(){
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};

        Q207_CourseSchedule.Solution solution = new Q207_CourseSchedule.Solution();
        assertFalse(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void testExample_3(){
        int numCourses = 3;
        int[][] prerequisites = {{1,0},{0,2},{2,1}};

        Q207_CourseSchedule.Solution solution = new Q207_CourseSchedule.Solution();
        assertFalse(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void testExample_4(){
        int numCourses = 3;
        int[][] prerequisites = {{0,1},{0,2},{1,2}};

        Q207_CourseSchedule.Solution solution = new Q207_CourseSchedule.Solution();
        assertTrue(solution.canFinish(numCourses, prerequisites));
    }

    @Test
    void testExample_5(){
        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,1},{3,2}, {1,3}};

        Q207_CourseSchedule.Solution solution = new Q207_CourseSchedule.Solution();
        assertFalse(solution.canFinish(numCourses, prerequisites));
    }
}