package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.HashMap;
import java.util.Map;

@Category(QuestionCategory.GREEDY)
public class Q3_LongestSubstringWithoutRepeatingCharacters {
    public static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> symbols = new HashMap<>();

            int ans = 0;
            int from = 0;
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (symbols.containsKey(c)) {
                    Integer index = symbols.get(c);

                    if(index >= from){
                        if (i - index == 1) {
                            from = i;
                        } else {
                            from = index + 1;
                        }
                    }
                }
                symbols.put(c, i);
                ans = Math.max(ans, i - from + 1);

            }

            return ans;
        }
    }
}
