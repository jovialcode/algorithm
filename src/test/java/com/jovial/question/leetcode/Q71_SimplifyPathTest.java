package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q71_SimplifyPathTest {
    @Test
    void testExample1(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/home/");
    }

    @Test
    void testExample2(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/home//foo/");
    }

    @Test
    void testExample3(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/home/user/Documents/../Pictures");
    }

    @Test
    void testExample4(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/.../a/../b/c/../d/./");
    }

    @Test
    void testExample5(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/../");
    }

    @Test
    void testExample6(){
        Q71_SimplifyPath.Solution solution = new Q71_SimplifyPath.Solution();
        solution.simplifyPath("/home/user/Documents/../../Pictures");
    }
}