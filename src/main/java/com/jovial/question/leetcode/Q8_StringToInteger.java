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
            boolean minus = false;
            if (strip.charAt(0) == '-') {
                minus = true;
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

            int up = 0;
            long answer = 0;

            int hasZero = 0;
            for (int i = 0; i < ans.size(); i++) {
                if (ans.get(i) != 0) break;
                hasZero += 1;
            }

            if(ans.size() - hasZero > 10 && minus) return -2147483648;
            if(ans.size() - hasZero > 10) return 2147483647;
            for (int i = ans.size() - 1; i >= hasZero; i--) {
                answer += (long) (ans.get(i) * (long) Math.pow(10, up++));
            }

            if (minus)
                answer = -answer;

            if (answer < -2147483648) answer = -2147483648;
            if (answer > 2147483647) answer = 2147483647;

            return (int) answer;
        }
    }
}
