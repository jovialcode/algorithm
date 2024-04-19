package com.jovial.question.leetcode;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Q12_IntegerToRoman {
    public static class Solution{
        public String intToRoman(int num) {
            Map<Integer, String> matcher = new TreeMap<>(Collections.reverseOrder());
            matcher.put(1, "I");
            matcher.put(4, "IV");
            matcher.put(5, "V");
            matcher.put(9, "IX");
            matcher.put(10, "X");
            matcher.put(40, "XL");
            matcher.put(50, "L");
            matcher.put(90, "XC");
            matcher.put(100, "C");
            matcher.put(400, "CD");
            matcher.put(500, "D");
            matcher.put(900, "CM");
            matcher.put(1000, "M");

            String ans = "";
            for (Integer key : matcher.keySet()) {
                while(num / key > 0){
                    ans = ans.concat(matcher.get(key));
                    num -= key;
                }
            }
            return ans;
        }
    }
}
