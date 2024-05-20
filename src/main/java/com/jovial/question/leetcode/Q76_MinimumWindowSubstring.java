package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.SLIDING_WINDOW)
public class Q76_MinimumWindowSubstring {
    public static class Solution {
        public String minWindow(String s, String t) {
            if (s.length() < t.length()) return "";

            int[] target = new int[52];
            for (int i = 0; i < t.length(); i++) {
                target[getIndex(t.charAt(i))]++;
            }

            int[] count = new int[52];
            int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, required = t.length();

            while (end < s.length()) {
                char endChar = s.charAt(end);
                int endIdx = getIndex(endChar);
                if (target[endIdx] > 0) {
                    if (count[endIdx] < target[endIdx]) required--;
                    count[endIdx]++;
                }
                end++;

                while (required == 0) {
                    if (end - start < minLen) {
                        minStart = start;
                        minLen = end - start;
                    }

                    char startChar = s.charAt(start);
                    int startIdx = getIndex(startChar);
                    if (target[startIdx] > 0) {
                        count[startIdx]--;
                        if (count[startIdx] < target[startIdx]) required++;
                    }
                    start++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }

        private int getIndex(char ch) {
            if (ch >= 'a') {
                return ch - 'a';
            }
            return ch - 'A' + 26;
        }
    }
}
