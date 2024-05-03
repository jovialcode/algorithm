package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

@Category(value = QuestionCategory.BINARY_TREE)
public class Q108_ConvertSortedArrayToBinarySearchTree {
    public static class Solution{
        public TreeNode sortedArrayToBST(int[] nums) {
            TreeNode treeNode = drawBinarySearchTree(nums, 0, nums.length);
            return treeNode;
        }

        private TreeNode drawBinarySearchTree(int[] nums, int left, int right){
            if(left >= right) return null;

            int mid = (right + left) / 2;

            TreeNode current = new TreeNode(nums[mid]);
            current.left = drawBinarySearchTree(nums, left, mid);
            current.right = drawBinarySearchTree(nums, mid + 1, right);

            return current;
        }
    }
}
