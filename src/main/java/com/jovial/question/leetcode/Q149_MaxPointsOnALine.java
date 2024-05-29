package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Category(QuestionCategory.GEOMETRY)
public class Q149_MaxPointsOnALine {
    public static class Solution {
        public int maxPoints(int[][] points) {
            int ans = 0;

            HashMap<Pair, Integer> counts = new HashMap<>();

            for (int i = 0; i < points.length; i++) {
                int fromX = points[i][0];
                int fromY = points[i][1];

                for (int j = i + 1; j < points.length; j++) {
                    int toX = points[j][0];
                    int toY = points[j][1];

                    int incline = toX - fromX != 0 ? (toY - fromY) / (toX - fromX) : Integer.MAX_VALUE;
                    int b = fromY - incline * fromX;

                    Pair pair = new Pair(incline, b);
                    counts.merge(pair, 1, Integer::sum);
                }
            }

            for(Integer count: counts.values())
                ans = Math.max(count, ans);

            return ans;
        }

        public class Pair{
            int incline;
            int b;

            public Pair(int incline, int b) {
                this.incline = incline;
                this.b = b;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return incline == pair.incline && b == pair.b;
            }

            @Override
            public int hashCode() {
                return Objects.hash(incline, b);
            }
        }
    }
}
