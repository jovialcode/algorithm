package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Category(value = QuestionCategory.BINARY_SEARCH)
public class Q530_MinimumAbsoluteDifferenceInBST {
    public static class Solution{
        public int getMinimumDifference(TreeNode root) {
            List<Integer> arr = new ArrayList<>();
            treeToArray(root, arr);

            int ans = Integer.MAX_VALUE;
            for (int i = 1; i < arr.size(); i++) {
                int val = arr.get(i) - arr.get(i - 1);
                ans = Math.min(ans, val);
            }

            return ans;
        }

        public void treeToArray(TreeNode root, List<Integer> arr){
            inOrder(root, arr);
        }

        public void inOrder(TreeNode cur, List<Integer> arr){
            if(Objects.isNull(cur)) return;

            inOrder(cur.left, arr);
            arr.add(cur.val);
            inOrder(cur.right, arr);
        }
    }
}
