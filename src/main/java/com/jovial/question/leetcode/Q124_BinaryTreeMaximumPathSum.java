package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Category(QuestionCategory.BINARY_TREE)
public class Q124_BinaryTreeMaximumPathSum {
    public static class Solution{
        public int maxPathSum(TreeNode root) {
            List<Integer> pathSum = new ArrayList<>();
            traverse(pathSum, root);

            return pathSum
                .stream()
                .max(Integer::compareTo).orElse(root.val);
        }

        private int traverse(List<Integer> pathSum, TreeNode cur){
            if(Objects.isNull(cur)){
                return 0;
            }

            int left = traverse(pathSum, cur.left);
            int right = traverse(pathSum, cur.right);

            int maxSum = cur.val;
            maxSum = Math.max(maxSum, cur.val + left);
            maxSum = Math.max(maxSum, cur.val + right);

            pathSum.add(Math.max(maxSum, cur.val + left + right));

            return maxSum;
        }
    }
}
