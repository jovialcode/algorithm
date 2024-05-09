package com.jovial.question.leetcode;


import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


@Category(value = QuestionCategory.DP)
public class Q322_CoinChange {
    public static class Solution {
        public int coinChange(int[] coins, int amount) {
            final int MAX_VALUE = 100001;
            int[] dp = new int[10001];
            Arrays.fill(dp, MAX_VALUE);

            Queue<Integer> queue = new LinkedList<>();
            queue.add(amount);

            dp[amount] = 0;
            while (!queue.isEmpty()) {
                int remain = queue.poll();
                for (int coin : coins) {
                    if (remain - coin < 0) continue;
                    if (dp[remain - coin] > dp[remain] + 1) {
                        dp[remain - coin] = dp[remain] + 1;
                        queue.add(remain - coin);
                    }
                }
            }
            return dp[0] == MAX_VALUE ? -1 : dp[0];
        }
    }
}
