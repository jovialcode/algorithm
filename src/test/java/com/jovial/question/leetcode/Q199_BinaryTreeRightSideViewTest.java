package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q199_BinaryTreeRightSideViewTest {
    @Test
    void testExample1(){
        Q199_BinaryTreeRightSideView.Solution solution = new Q199_BinaryTreeRightSideView.Solution();
        //
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        //
        root.right.right = new TreeNode(4);
        //
        root.left.right = new TreeNode(5);
        solution.rightSideView(root);
    }

}