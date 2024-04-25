package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

@Category(value = QuestionCategory.BINARY_TREE)
public class Q106_ConstructBinaryTreeFromInorderAndPostOrder {
    public static class Solution{
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return postorderTraverse(
                    postorder, postorder.length -1,0,
                    inorder, 0, inorder.length -1);
        }

        private TreeNode postorderTraverse(int[] postorder, int postStart, int postEnd,
                                  int[] inorder, int inStart, int inEnd){

            if (postEnd > postStart || inStart > inEnd) {
                return null;
            }

            int currentValue = postorder[postStart];
            int currentRootPost = findPos(inorder, currentValue);
            TreeNode current = new TreeNode(currentValue);
            int margin = inEnd - currentRootPost;


            current.left = postorderTraverse(postorder, postStart - margin - 1, postEnd, inorder, inStart, currentRootPost - 1);
            current.right = postorderTraverse(postorder, postStart - 1, postStart - margin, inorder, currentRootPost, inEnd);

            return current;
        }

        public int findPos(int[] arr, int value){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]== value) return i;
            }
            return -1;
        }
    }
}
