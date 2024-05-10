package com.jovial.question.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q935_KnightDialer {
    public static class Solution {
        public int knightDialer(int n) {
            final long MODULE_VALUE = 1000000000 + 7;
            final List<List<Integer>> knightMove = new ArrayList<>();
            long[][] dp = new long[5001][10];

            //
            createKnightMove(knightMove);
            for (int i = 0; i <= 9; i++) dp[1][i] = 1;
            //
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j <= 9; j++) {
                    for (Integer k : knightMove.get(j)) {
                        dp[i][j] += (dp[i - 1][k] % MODULE_VALUE);
                    }
                }
            }

            //
            long sum = 0;
            for (int i = 0; i <= 9; i++) {
                sum += (dp[n][i] % MODULE_VALUE);
            }
            return (int) (sum % MODULE_VALUE);
        }

        private void createKnightMove(List<List<Integer>> knightMove) {
            for (int i = 0; i <= 9; i++) {
                knightMove.add(new ArrayList<>());
            }

            knightMove.get(0).addAll(List.of(4, 6));
            knightMove.get(1).addAll(List.of(6, 8));
            knightMove.get(2).addAll(List.of(7, 9));
            knightMove.get(3).addAll(List.of(4, 8));
            knightMove.get(4).addAll(List.of(3, 9, 0));
            knightMove.get(5).addAll(List.of());
            knightMove.get(6).addAll(List.of(1, 7, 0));
            knightMove.get(7).addAll(List.of(2, 6));
            knightMove.get(8).addAll(List.of(1, 3));
            knightMove.get(9).addAll(List.of(2, 4));
        }
    }
}
