package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(QuestionCategory.STACK)
public class Q224_BasicCalculator {
    public static class Solution {
        public int calculate(String s) {
            String commands = s.replaceAll(" ", "");
            commands = commands.replaceAll("\\(", "( ");
            commands = commands.replaceAll("\\)", " )");
            commands = commands.replaceAll("\\+", " + ");
            commands = commands.replaceAll("-", " - ");
            String[] split = commands.split(" ");

            Stack<String> stack = new Stack<>();
            for (int i = split.length - 1; i >= 0; i--) {
                String command = split[i];
                if(command.equals(" ") || command.equals("")) continue;

                if (command.equals("(")) {
                    if (!stack.empty()) {
                        calLoop(stack);
                    }
                } else {
                    stack.add(command);
                }
            }

            calLoop(stack);
            return Integer.parseInt(stack.pop());
        }

        private void calLoop(Stack<String> stack) {
            List<Integer> batch = new ArrayList<>();
            while (!stack.empty()) {
                String pointer = stack.pop();
                if (pointer.equals(")")) break;
                if (Objects.equals(pointer, "-")) {
                    String value = stack.pop();
                    batch.add(-(Integer.parseInt(value)));
                } else if (pointer.equals("+")) {
                    String value = stack.pop();
                    batch.add((Integer.parseInt(value)));
                }else{
                    batch.add(Integer.parseInt(pointer));
                }
            }

            Integer sum = batch.stream().reduce(0, Integer::sum);
            stack.add(String.valueOf(sum));
        }
    }
}
