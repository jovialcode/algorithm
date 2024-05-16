package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.ListNode;

import java.util.*;

@Category(QuestionCategory.LINKED_LIST)
public class Q23_MergeKSortedLists {
    public static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            //
            PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
            for(ListNode listNode : lists){
                if(Objects.isNull(listNode)) continue;
                priorityQueue.add(listNode);
            }

            //
            ListNode head = null;
            while (!priorityQueue.isEmpty()) {
                ListNode current = priorityQueue.poll();

                if (!Objects.isNull(current.next)) {
                    priorityQueue.add(current.next);
                }

                if (Objects.isNull(head)) {
                    head = current;
                    head.next = null;
                } else {
                    ListNode insertNode = findInsert(head);
                    insertNode.next = current;
                    current.next = null;
                }
            }
            return head;
        }

        private ListNode findInsert(ListNode head) {
            ListNode temp = head;
            while (!Objects.isNull(temp.next)) {
                temp = temp.next;
            }
            return temp;
        }
    }
}
