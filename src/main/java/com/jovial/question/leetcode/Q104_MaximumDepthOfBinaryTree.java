package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

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


    }
}
