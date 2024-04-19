package com.jovial.question.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q13_RomanToInteger {
    public static class Solution{
        public int romanToInt(String s){
            Map<String, Integer> matcher = new HashMap<>();
            matcher.put("I", 1);
            matcher.put("V", 5);
            matcher.put("X", 10);
            matcher.put("L", 50);
            matcher.put("C", 100);
            matcher.put("D", 500);
            matcher.put("M", 1000);
            matcher.put("IV", 4);
            matcher.put("IX", 9);
            matcher.put("XL", 40);
            matcher.put("XC", 90);
            matcher.put("CD", 400);
            matcher.put("CM", 900);

            String[] strings = s.split("");
            int ans = 0;
            for (int i = 0; i < strings.length; i++) {
                String v = strings[i];


                if ( i != strings.length - 1){
                    String peek = strings[i+1];
                    String check = v.concat(peek);

                    if (matcher.containsKey(check)){
                        Integer value = matcher.get(check);
                        ans += value;
                        i += 1;
                        continue;
                    }
                }

                Integer value = matcher.get(v);
                ans += value;
            }
            return ans;
        }
    }
}
