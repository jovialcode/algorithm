package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Objects;

@Category(value = QuestionCategory.BINARY_TREE)
public class Q266_InvertBinaryTree {
    public static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(Objects.isNull(root)) return null;
            TreeNode afterRoot = new TreeNode(root.val);
            traverseFromRight(root, afterRoot);
            return afterRoot;
        }

        public boolean traverseFromRight(TreeNode before, TreeNode after){
            if(Objects.isNull(before)) return false;

            after.val = before.val;
            if(!Objects.isNull(before.right)){
                after.left = new TreeNode();
                traverseFromRight(before.right, after.left);
            }

            if(!Objects.isNull(before.left)){
                after.right = new TreeNode();
                traverseFromRight(before.left, after.right);
            }

            return false;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
