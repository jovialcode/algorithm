package com.jovial.quetsion.leetcode;

import com.jovial.question.leetcode.Q105_ConstructBinaryTreeFromPreorderAndInorder;
import com.jovial.question.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

public class Q105_ConstructBinaryTreeFromPreorderAndInorder_Test {
    @Test
    void testExample_1(){
        Q105_ConstructBinaryTreeFromPreorderAndInorder.Solution solution = new Q105_ConstructBinaryTreeFromPreorderAndInorder.Solution();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode treeNode = solution.buildTree(preorder, inorder);
        System.out.println(treeNode.toString());
    }
}
