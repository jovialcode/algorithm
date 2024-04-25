package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;


@Category(QuestionCategory.BINARY_TREE)
public class Q105_ConstructBinaryTreeFromPreorderAndInorder {
    public static class Solution{
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return drawTree(preorder, 0, preorder.length -1,
                    inorder, 0, inorder.length - 1);
        }

        private TreeNode drawTree(int[] preorder, int preStart, int preEnd,
                                  int[] inorder, int inStart, int inEnd){
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }

            int currentValue = preorder[preStart];
            TreeNode currentRoot = new TreeNode(currentValue);
            int currentRootPos = findPos(inorder, currentValue);

            // Preorder Drawing
            // Left
            int leftSubtreeSize = currentRootPos - inStart;
            currentRoot.left = drawTree(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, currentRootPos - 1);

            //Right
            currentRoot.right = drawTree(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, currentRootPos + 1, inEnd);

            return currentRoot;
        }

        public int findPos(int[] arr, int value){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]== value) return i;
            }
            return -1;
        }
    }


}