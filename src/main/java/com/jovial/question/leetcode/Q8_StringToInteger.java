package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.List;

@Category(QuestionCategory.MATH)
public class Q8_StringToInteger {
    public static class Solution {
        public int myAtoi(String s) {
            //step1
            String strip = s.strip();
            if (strip.isEmpty()) return 0;
            //step2
            int minus = 1;
            if (strip.charAt(0) == '-') {
                minus = -1;
                strip = strip.substring(1);
            } else if (strip.charAt(0) == '+') {
                strip = strip.substring(1);
            }

            //step3
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < strip.length(); i++) {
                int digit = strip.charAt(i) - '0';
                if (!(digit >= 0 && digit <= 9)) break;
                ans.add(digit);
            }

            if (ans.size() == 0) return 0;

            // solve
            int answer = 0;
            int hasZero = 0;
            int maxValue = Integer.MAX_VALUE;
            int minValue = Integer.MIN_VALUE;

            for (Integer an : ans) {
                if (an != 0) break;
                hasZero += 1;
            }

            if (ans.size() - hasZero > 10) return (minus == 1) ? maxValue : minValue;
            for (int i = hasZero; i < ans.size(); i++) {
                answer += answer * 10 + ans.get(i);
            }

            return minus * answer;
        }
    }
}
