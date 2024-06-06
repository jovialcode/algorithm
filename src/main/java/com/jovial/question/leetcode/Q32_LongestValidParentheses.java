package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Stack;

@Category(QuestionCategory.GREEDY)
public class Q32_LongestValidParentheses {
    public static class Solution {
        public int longestValidParentheses(String s) {
            Stack<Character> depth = new Stack<>();

            int maxValid = 0;
            int valid = 0;

            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);

                if(depth.isEmpty() && valid != 0)
                    maxValid = Math.max(maxValid, valid);

                if (c.equals('(')) {
                    depth.add(c);
                } else {
                    if (!depth.isEmpty()) {
                        depth.pop();
                        valid += 2;
                    } else {
                        maxValid = Math.max(maxValid, valid);
                        valid = 0;
                    }
                }
            }

            if(depth.isEmpty())
                maxValid = Math.max(maxValid, valid);

            depth = new Stack<>();
            valid = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                Character c = s.charAt(i);

                if(depth.isEmpty() && valid != 0)
                    maxValid = Math.max(maxValid, valid);

                if (c.equals(')')) {
                    depth.add(c);
                } else {
                    if (!depth.isEmpty()) {
                        depth.pop();
                        valid += 2;
                    } else {
                        maxValid = Math.max(maxValid, valid);
                        valid = 0;
                    }
                }
            }

            if(depth.isEmpty())
                maxValid = Math.max(maxValid, valid);

            return maxValid;
        }
    }
}
