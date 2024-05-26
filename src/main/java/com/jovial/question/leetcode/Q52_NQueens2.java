package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashSet;
import java.util.Set;

@Category({QuestionCategory.BACKTRACKING, QuestionCategory.GREEDY})
public class Q52_NQueens2 {
    public static class Solution {
        public int totalNQueens(int n) {
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                Set<Integer> visit = new HashSet<>();
                visit.add(i);
                ans += draw(n, visit, i);
            }
            return ans;
        }

        private int draw(int maxSize, Set<Integer> visit, int cur) {
            if (visit.size() == maxSize) return 1;
            if (cur > maxSize * maxSize) return 0;

            int sum = 0;
            for (int i = 1; i <= maxSize; i++) {
                int nextMove = ((cur - 1) / maxSize + 1) * maxSize + i;

                if (isAvailable(maxSize, visit, nextMove)) {
                    visit.add(nextMove);
                    sum += draw(maxSize, visit, nextMove);
                    visit.remove(nextMove);
                }
            }
            return sum;
        }

        private boolean isAvailable(int maxSize, Set<Integer> visit, int cur) {
            int row = (cur - 1) / maxSize + 1;
            int col = (cur - 1) % maxSize + 1;

            for (Integer check : visit) {
                int checkRow = (check - 1) / maxSize + 1;
                int checkCol = (check - 1) % maxSize + 1;

                if (row == checkRow || col == checkCol) return false;
                if (Math.abs(checkRow - row) == Math.abs(checkCol - col)) return false;
            }
            return true;
        }
    }
}
