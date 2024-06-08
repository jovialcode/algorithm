package com.jovial.question.codetest.day240608;

public class Question1 {
    public static class Solution {
        public long[] solution(String s, String op) {

            long[] answer = new long[s.length() - 1];

            for (int i = 0; i < s.length() - 1; i++) {
                int val1 = Integer.parseInt(s.substring(0, i + 1));
                int val2 = Integer.parseInt(s.substring(i + 1));

                long temp = 0;
                switch (op) {
                    case "+":
                        temp = val1 + val2;
                        break;
                    case "-":
                        temp = val1 - val2;
                        break;
                    case "*":
                        temp = (long) val1 * val2;
                }
                answer[i] = temp;

            }
            return answer;
        }
    }
}
