package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Category(value = QuestionCategory.BINARY_TREE)
public class Q100_SameTree {
    public static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            List<Integer> pList = treeToList(p);
            List<Integer> qList = treeToList(q);

            if(pList.size() != qList.size()) return false;
            for (int i = 0; i < pList.size(); i++) {
                if(!Objects.equals(pList.get(i), qList.get(i))) return false;
            }
            return true;
        }

        public List<Integer> treeToList(TreeNode current) {
            List<Integer> arr = new ArrayList<>();
            dfs(current, arr);
            return arr;
        }

        public boolean dfs(TreeNode current, List<Integer> arr) {
            if (Objects.isNull(current)) return false;

            arr.add(current.val);
            if (Objects.isNull(current.left)) {
                arr.add(11);
            }

            if (Objects.isNull(current.right)) {
                arr.add(22);
            }

            return dfs(current.left, arr) || dfs(current.right, arr);
        }
    }

    public class TreeNode {
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
