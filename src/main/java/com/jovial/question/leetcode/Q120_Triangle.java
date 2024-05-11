package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.List;

@Category(QuestionCategory.DP)
public class Q120_Triangle {
    public static class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int dp[][] = new int[202][202];

            for (int i = triangle.size() - 1; i >= 0; i--) {
                List<Integer> current = triangle.get(i);
                for (int j = 0; j < current.size(); j++) {
                    if (i == triangle.size() - 1) {
                        dp[i][j] = current.get(j);
                    }

                    dp[i][j] = current.get(j) + Math.min(dp[i+1][j], dp[i+1][j+1]);
                }
            }


            return dp[0][0];
        }
    }
}
