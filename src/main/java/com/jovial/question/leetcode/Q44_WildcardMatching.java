package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.DP)
public class Q44_WildcardMatching {
    public static class Solution {
        public boolean isMatch(String s, String p) {
            int sPoint = 0;
            int pPoint = 0;

            while (sPoint < s.length() && pPoint < p.length()) {

                char sc = s.charAt(sPoint);
                char pc = p.charAt(pPoint);
                if (sc == pc || pc == '?') {
                    if (sPoint == s.length() - 1 && pPoint == p.length() - 1) {
                        return true;
                    }

                    sPoint += 1;
                    pPoint += 1;
                    continue;
                }

                if (pc != '*') return false;

                int alpha = findAlpha(p, pPoint);
                if (alpha == -1) {
                    return true;
                } else {
                    pPoint = alpha;
                    int pos = findValue(s, sPoint, p.charAt(alpha));
                    if (pos == -1) return false;
                    else {
                        sPoint = pos;
                    }
                }

            }
            return false;
        }

        private int findValue(String s, int cur, char value) {
            while (++cur < s.length()) {
                char c = s.charAt(cur);
                if (c == value) return cur;
            }
            return -1;
        }

        private int findAlpha(String p, int cur) {
            int pos = -1;

            while (++cur < p.length()) {
                char c = p.charAt(cur);
                if (c != '*' && c != '?') {
                    return cur;
                }
            }

            return pos;
        }
    }

    public static class RefineSolution {
        public boolean isMatch(String s, String p) {
            //validation
            if (s.isEmpty() && isAll(p, 0)) return true;
            int[][] visit = new int[s.length()][p.length()];
            for (int[] v : visit) {
                Arrays.fill(v, -1);
            }
            return proceed(visit, s, 0, p, 0) == 1;
        }

        private int proceed(int[][] visit, String s, int sIndex, String p, int pIndex) {
            if (sIndex == s.length()) {
                if (pIndex == p.length() || isAll(p, pIndex))
                    return 1;
            }
            if (sIndex >= s.length() || pIndex >= p.length()) {
                return 0;
            }

            char sChar = s.charAt(sIndex);
            char pChar = p.charAt(pIndex);

            if (visit[sIndex][pIndex] != -1) return visit[sIndex][pIndex];
            visit[sIndex][pIndex] = 0;

            if (sChar == pChar || pChar == '?') {
                return proceed(visit, s, sIndex + 1, p, pIndex + 1);
            }
            if (pChar == '*') {
                // * as keep
                if (proceed(visit, s, sIndex + 1, p, pIndex) == 1) {
                    return visit[sIndex][pIndex] = 1;
                }
                // * as char
                if (proceed(visit, s, sIndex + 1, p, pIndex + 1) == 1) {
                    return visit[sIndex][pIndex] = 1;
                }

                // * as none
                return visit[sIndex][pIndex] = proceed(visit, s, sIndex, p, pIndex + 1);
            }

            //different
            return visit[sIndex][pIndex];
        }

        private boolean isAll(String p, int pIndex) {
            for (int i = pIndex; i < p.length(); i++) {
                if (p.charAt(i) != '*') return false;
            }
            return true;
        }
    }
}
