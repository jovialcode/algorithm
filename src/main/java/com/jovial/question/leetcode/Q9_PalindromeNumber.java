package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.ARRAY)
public class Q9_PalindromeNumber {
    public static class Solution {
        public boolean isPalindrome(int x) {
            return isPalindrome(Integer.toString(x));
        }

        private boolean isPalindrome(String x) {
            int start = 0;
            int end = x.length() - 1;

            while (start < end) {
                if (x.charAt(start) != x.charAt(end)) return false;

                start++;
                end--;
            }

            return true;
        }
    }
}
