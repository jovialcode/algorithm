package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(value = QuestionCategory.DP)
public class Q139_WordBreak {
    public static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordSet = new HashSet<>(wordDict);
            return dfs(s, wordSet, new HashMap<>());
        }

        private boolean dfs(String s, Set<String> wordSet, Map<String, Boolean> memo) {
            if (s.isEmpty()) return true;
            if (memo.containsKey(s)) return memo.get(s);

            for (int i = 1; i <= s.length(); i++) {
                String prefix = s.substring(0, i);
                if (wordSet.contains(prefix) && dfs(s.substring(i), wordSet, memo)) {
                    memo.put(s, true);
                    return true;
                }
            }

            memo.put(s, false);
            return false;
        }
    }
}
