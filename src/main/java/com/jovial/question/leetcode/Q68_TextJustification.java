package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category({QuestionCategory.GREEDY, QuestionCategory.STRING})
public class Q68_TextJustification {
    public static class Solution {
        public List<String> fullJustify(String[] words, int maxWidth) {
            Deque<String> queue = new LinkedList<>(List.of(words));

            List<String> ans = new ArrayList<>();
            List<String> strings = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            while (!queue.isEmpty()) {
                String word = queue.poll();
                if (sb.length() + (strings.size() > 0 ? strings.size() - 1 : 0) + word.length() <= maxWidth) {
                    sb.append(word);
                    strings.add(word);
                } else {
                    queue.addFirst(word);
                }
                //
                String peekWord = queue.peek();
                if (Objects.isNull(peekWord)) {
                    ans.add(makeLine(strings, sb.length(), maxWidth, true));
                    break;
                }

                if (sb.length() + (strings.size() > 0 ? strings.size() - 1 : 0) + peekWord.length() >= maxWidth) {
                    ans.add(makeLine(strings, sb.length(), maxWidth, false));
                    sb = new StringBuilder();
                    strings = new ArrayList<>();
                }
            }

            return ans;
        }

        private String makeLine(List<String> words, int sbLength, int maxWidth, boolean left) {
            int cnt = words.size();
            if (cnt == 1 || left) return left(words, maxWidth);

            int margin = maxWidth - sbLength;
            int padding = margin / (cnt - 1);
            int temp = maxWidth - (sbLength + padding * (cnt - 1));
            //
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                sb.append(words.get(i));

                if (i != words.size() - 1) {
                    sb.append(" ".repeat(padding));
                    if (temp-- > 0)
                        sb.append(" ");
                }
            }
            return sb.toString();
        }

        private String left(List<String> words, int maxWidth) {
            String joined = String.join(" ", words);
            if (maxWidth - joined.length() > 0) {
                joined = joined.concat(" ".repeat(maxWidth - joined.length()));
            }
            return joined;
        }
    }
}
