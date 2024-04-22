package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(value = QuestionCategory.ARRAY)
public class Q14_LongestCommonPrefix {
    public static class Solution{
        public String longestCommonPrefix(String[] strs) {
            // sort
            Arrays.sort(strs);

            String ans = strs.length == 1 ? strs[0]: "";
            int similarity = 201;
            for (int i = 1; i <= strs.length - 1; i++) {
                String similarSubString = calSimilarity(strs[i - 1], strs[i]);
                if(similarity > similarSubString.length()){
                    ans = similarSubString;
                    similarity = similarSubString.length();
                }

                if(similarity == 0) break;
            }

            return ans;
        }

        private String calSimilarity(String str1, String str2){
            int similarity = 0;

            int len = Math.min(str1.length(), str2.length());
            for (int i = 0; i < len; i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);

                if(c1 == c2) similarity += 1;
                else break;
            }
            return str1.substring(0, similarity);
        }
    }
}
