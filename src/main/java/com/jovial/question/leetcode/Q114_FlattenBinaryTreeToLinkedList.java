package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

import java.util.Objects;
import java.util.Stack;


@Category(value = QuestionCategory.BINARY_TREE)
public class Q114_FlattenBinaryTreeToLinkedList {
    public static class Solution{
        public void flatten(TreeNode root) {
            Stack<TreeNode> linkedList = new Stack<>();
            preorderTraverse(root, linkedList);
            while(!linkedList.empty()){
                var pop = linkedList.pop();

                if(!linkedList.empty()){
                    var peek = linkedList.peek();
                    peek.right = pop;
                }
                pop.left = null;
            }
        }

        private void preorderTraverse(TreeNode current, Stack<TreeNode> linkedList){
            if(Objects.isNull(current)) return;

            linkedList.push(current);
            preorderTraverse(current.left, linkedList);
            preorderTraverse(current.right, linkedList);
        }
    }
}
