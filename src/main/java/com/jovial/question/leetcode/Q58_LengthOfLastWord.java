package com.jovial.question.leetcode;



public class Q58_LengthOfLastWord {
    public static class Solution{
        public int lengthOfLastWord(String s) {
            String sentence = s.trim();
            String[] splitSentence = sentence.split(" ");
            String ans = splitSentence[splitSentence.length - 1];
            return ans.length();
        }
    }
}
