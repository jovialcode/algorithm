package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Objects;

@Category(value = QuestionCategory.BINARY_TREE)
public class Q104_MaximumDepthOfBinaryTree {
    public static class Solution{
        public int maxDepth(TreeNode root) {
            return dfs(root, 0);
        }

        public int dfs(TreeNode from, int depth){
            if(Objects.isNull(from)) return depth;

            int leftDepth = dfs(from.left, depth + 1);
            int rightDepth = dfs(from.right, depth + 1);

            return Math.max(leftDepth, rightDepth);
        }

         public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
               this.val = val;
               this.left = left;
               this.right = right;
            }
         }
    }
}
