package com.jovial.question.leetcode;

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
}
