package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Stack;

@Category(value = QuestionCategory.STACK)
public class Q20_ValidParentheses {
    public static class Solution{
        public boolean isValid(String s) {
            Stack<Character> validator = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                boolean result = true;

                if("({[".indexOf(c) > -1) {
                    validator.push(c);
                } else if(!validator.empty()){
                    switch (validator.pop()) {
                        case '(':
                            result = ')' == c;
                            break;
                        case '{':
                            result = '}' == c;
                            break;
                        case '[':
                            result = ']' == c;
                            break;
                        default:
                            result = false;
                    }
                } else{
                    result = false;
                }

                if(!result) return false;
            }
            return validator.empty();
        }
    }
}
