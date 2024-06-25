package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Category(QuestionCategory.BINARY_TREE)
public class Q199_BinaryTreeRightSideView {
    public static class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            traverse(root, 0, ans);
            return ans;
        }

        public void traverse(TreeNode cur, int height, List<Integer> ans) {
            if (Objects.isNull(cur)) return;

            try{
                ans.get(height);
            }catch (IndexOutOfBoundsException e){
                ans.add(cur.val);
            }

            if (!Objects.isNull(cur.right)) {
                traverse(cur.right, height + 1, ans);
            }

            if (!Objects.isNull(cur.left)) {
                traverse(cur.left, height + 1, ans);
            }
        }
    }
}
