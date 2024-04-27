package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

public class Q106_ConstructBinaryTreeFromPreorderAndInorderTest {
    @Test
    void testExample_1(){
        Q106_ConstructBinaryTreeFromInorderAndPostOrder.Solution solution = new Q106_ConstructBinaryTreeFromInorderAndPostOrder.Solution();
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        TreeNode treeNode = solution.buildTree(inorder, postorder);
        System.out.println(treeNode.toString());
    }
}
