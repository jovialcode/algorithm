package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;


class Q114_FlattenBinaryTreeToLinkedListTest {
    @Test
    void testExample_1(){
        Q114_FlattenBinaryTreeToLinkedList.Solution solution = new Q114_FlattenBinaryTreeToLinkedList.Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        solution.flatten(root);
    }
}