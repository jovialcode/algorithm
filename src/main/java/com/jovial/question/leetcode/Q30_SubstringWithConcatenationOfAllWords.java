package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Category(QuestionCategory.ARRAY)
public class Q30_SubstringWithConcatenationOfAllWords {
    public static class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            if (words.length == 0) return Collections.EMPTY_LIST;
            //
            HashMap<String, Integer> wordCount = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            //
            int wordLen = words[0].length();
            int maxWordLen = wordLen * words.length;
            List<Integer> ans = new ArrayList<>();

            for (int start = 0; start <= s.length() - maxWordLen; start++) {

                int cnt = 0;
                HashMap<String, Integer> windows = new HashMap<>();
                for (int end = start; end <= start + (maxWordLen - wordLen); end += wordLen) {
                    String substring = s.substring(end, end + wordLen);
                    windows.put(substring, windows.getOrDefault(substring, 0) + 1);
                    if(windows.get(substring) > wordCount.getOrDefault(substring, 0)) break;
                    cnt += 1;
                }
                if( cnt == words.length) ans.add(start);
            }

            return ans;
        }
    }
}
