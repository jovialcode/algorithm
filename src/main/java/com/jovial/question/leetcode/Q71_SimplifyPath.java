package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Stack;

@Category(value = QuestionCategory.STACK)
public class Q71_SimplifyPath {
    public static class Solution{
        public String simplifyPath(String path) {
            Stack<String> simplePath = new Stack<>();

            String cleanPath = cleanPath(path);
            String[] splitPath = cleanPath.split("/");

            //
            for (int i = 0; i < splitPath.length; i++) {
                String split = splitPath[i];
                switch (split){
                    case "..":
                        if(simplePath.size() > 0) simplePath.pop();
                        break;
                    case ".":
                    case "":
                        break;
                    default:
                        simplePath.add("/".concat(split));
                }
            }
            return simplePath.size() == 0 ? "/" : String.join("", simplePath);
        }

        public String cleanPath(final String path){
            return path.replaceAll("//", "/");
        }
    }
}
