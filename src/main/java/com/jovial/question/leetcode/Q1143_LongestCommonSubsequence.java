package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.DP)
public class Q1143_LongestCommonSubsequence {
    public static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int[][] dp = new int[text1.length()][text2.length()];
            for (int i = 0; i < text1.length(); i++) {
                Arrays.fill(dp[i], -1);
            }

            return sol(text1, text2, dp, 0, 0);
        }

        private int sol(String text1, String text2, int[][] dp, int cur1, int cur2) {
            if (cur1 == text1.length() || cur2 == text2.length()) return 0;
            if (dp[cur1][cur2] != -1) return dp[cur1][cur2];

            int ans = 0;
            char text1Char = text1.charAt(cur1);
            if (text1Char == text2.charAt(cur2)) {
                ans = Math.max(ans, sol(text1, text2, dp, cur1 + 1, cur2 + 1) + 1);
            } else {
                ans = Math.max(ans, sol(text1, text2, dp, cur1 + 1, cur2));
                ans = Math.max(ans, sol(text1, text2, dp, cur1, cur2 + 1));
            }
            return dp[cur1][cur2] = ans;
        }
    }
}
