package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

@Category({QuestionCategory.STACK, QuestionCategory.LINKED_LIST})
public class Q25_ReverseNodesInKGroup {
    public static class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {

            ListNode current = head;
            ListNode ans = head;
            List<ListNode> reverseHead = new ArrayList<>();
            List<ListNode> reverseTail = new ArrayList<>();
            //
            while (true) {
                Stack<ListNode> stack = new Stack<>();
                int round = k;
                //
                while (--round >= 0 && !Objects.isNull(current)) {
                    stack.add(current);
                    current = current.next;
                }
                //
                if (stack.size() != k) break;

                if (!stack.isEmpty()) {
                    reverseHead.add(stack.peek());
                }

                while (!stack.isEmpty()) {
                    ListNode reverse = stack.pop();
                    if (!stack.isEmpty()) {
                        reverse.next = stack.peek();
                    } else {
                        reverse.next = current;
                        reverseTail.add(reverse);
                    }
                }
            }

            for (int i = 0; i < reverseHead.size() - 1; i++) {
                ListNode listNode = reverseTail.get(i);
                listNode.next = reverseHead.get(i + 1);
            }


            return reverseHead.size() > 0 ? reverseHead.get(0): ans;
        }
    }
}
