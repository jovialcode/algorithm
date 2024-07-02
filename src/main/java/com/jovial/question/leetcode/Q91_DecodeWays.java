package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

@Category(QuestionCategory.DP)
public class Q91_DecodeWays {
    public static class Solution {
        public int numDecodings(String s) {
            int strLen = s.length();

            int[] dp = new int[strLen + 1];
            dp[0] = 1;

            if (s.charAt(0) != '0') {
                dp[1] = 1;
            } else {
                return 0;
            }

            for (int i = 2; i <= strLen; ++i) {
                if (s.charAt(i - 1) != '0') {
                    dp[i] += dp[i - 1];
                }

                if (s.charAt(i - 2) == '1' ||
                    (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6')) {
                    dp[i] += dp[i - 2];
                }
            }

            return dp[strLen];
        }
    }
}
