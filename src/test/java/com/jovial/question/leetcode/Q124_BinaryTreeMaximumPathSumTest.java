package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q124_BinaryTreeMaximumPathSumTest {
    @Test
    void testExample(){
        Q124_BinaryTreeMaximumPathSum.Solution solution = new Q124_BinaryTreeMaximumPathSum.Solution();

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        root.left = node2;
        root.right = node3;

        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void testExample2(){
        Q124_BinaryTreeMaximumPathSum.Solution solution = new Q124_BinaryTreeMaximumPathSum.Solution();

        TreeNode root = new TreeNode(-10);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;

        assertEquals(42, solution.maxPathSum(root));
    }

    @Test
    void testExample3(){
        Q124_BinaryTreeMaximumPathSum.Solution solution = new Q124_BinaryTreeMaximumPathSum.Solution();

        TreeNode root = new TreeNode(-9);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(30);
        TreeNode node5 = new TreeNode(16);
        TreeNode node6 = new TreeNode(50);
        TreeNode node7 = new TreeNode(70);

        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        assertEquals(131, solution.maxPathSum(root));
    }

    @Test
    void testExample4(){
        Q124_BinaryTreeMaximumPathSum.Solution solution = new Q124_BinaryTreeMaximumPathSum.Solution();

        TreeNode root = new TreeNode(2);
        TreeNode node2 = new TreeNode(-1);

        root.left = node2;

        assertEquals(2, solution.maxPathSum(root));
    }

    @Test
    void testExample5(){
        Q124_BinaryTreeMaximumPathSum.Solution solution = new Q124_BinaryTreeMaximumPathSum.Solution();

        TreeNode root = new TreeNode(9);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(-6);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(-6);
        TreeNode node8 = new TreeNode(-6);
        TreeNode node9 = new TreeNode(-6);

        root.left = node2;
        root.right = node3;

        node3.left = node4;
        node3.right = node5;

        node5.left = node6;

        node6.left = node7;
        node6.right = node8;

        node7.left = node9;

        assertEquals(16, solution.maxPathSum(root));
    }
}