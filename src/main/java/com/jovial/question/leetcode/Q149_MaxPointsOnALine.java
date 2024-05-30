package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashMap;
import java.util.Objects;

@Category(QuestionCategory.GEOMETRY)
public class Q149_MaxPointsOnALine {
    public static class Solution {
        public int maxPoints(int[][] points) {
            if (Objects.isNull(points) || points.length == 0) return 0;
            if (points.length == 1) return 1;

            int ans = 0;
            for (int i = 0; i < points.length; i++) {
                HashMap<Pair, Integer> counts = new HashMap<>();
                int currentMax = 0;

                for (int j = i + 1; j < points.length; j++) {
                    int deltaX = points[j][0] - points[i][0];
                    int deltaY = points[j][1] - points[i][1];

                    int gcd = gcd(deltaX, deltaY);
                    deltaX /= gcd;
                    deltaY /= gcd;


                    Pair pair = new Pair(deltaX, deltaY);
                    counts.merge(pair, 1, Integer::sum);
                    currentMax = Math.max(currentMax, counts.get(pair) + 1);
                }
                ans = Math.max(ans, currentMax);
            }
            return ans;
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public class Pair {
            int deltaX;
            int deltaY;


            public Pair(int deltaX, int deltaY) {
                this.deltaX = deltaX;
                this.deltaY = deltaY;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return deltaX == pair.deltaX && deltaY == pair.deltaY;
            }

            @Override
            public int hashCode() {
                return Objects.hash(deltaX, deltaY);
            }
        }
    }
}
