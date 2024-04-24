package com.jovial.question.leetcode;

import java.util.Objects;

public class Q101_SymmetricTree {
    public static class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (Objects.isNull(root)) return false;

            return traverseTree(root.left, root.right);
        }

        private boolean traverseTree(TreeNode left, TreeNode right) {
            if (Objects.isNull(left) && Objects.isNull(right)) return true;
            if (Objects.isNull(left) || Objects.isNull(right)) return false;

            return left.val == right.val &&
                    traverseTree(left.left, right.right) &&
                    traverseTree(left.right, right.left);
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
