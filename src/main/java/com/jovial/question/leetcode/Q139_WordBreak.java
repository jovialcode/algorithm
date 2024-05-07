package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(value = QuestionCategory.DFS)
public class Q139_WordBreak {
    public static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            for(String start : wordDict){
                StringBuilder making = new StringBuilder();
                making.append(start);
                //
                dfs(s, wordDict, making);
                if(s.equals(making.toString())) return true;
            }

            return false;
        }

        private boolean dfs(String ans, List<String> wordDict, StringBuilder making){
            String checking = making.toString();
            int current = making.length();

            if (ans.equals(checking)) return true;
            if (ans.indexOf(checking) != 0) return false;

            for (String appendWord: wordDict){
                making.append(appendWord);

                if(!dfs(ans, wordDict, making)){
                    making.delete(current, current + appendWord.length());
                } else return true;
            }

            return false;
        }
    }
}
