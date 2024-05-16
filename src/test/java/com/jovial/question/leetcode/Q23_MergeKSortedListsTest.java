package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q23_MergeKSortedListsTest {
    @Test
    void testExample1(){
        ListNode first = new ListNode(1);
        first.next = new ListNode(4);
        first.next.next = new ListNode(5);

        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next = new ListNode(4);

        ListNode third = new ListNode(2);
        third.next = new ListNode(6);

        var lists = new ListNode[]{first, second, third};

        Q23_MergeKSortedLists.Solution solution = new Q23_MergeKSortedLists.Solution();
        solution.mergeKLists(lists);
    }

    @Test
    void testExample2(){
        ListNode first = null;

        var lists = new ListNode[]{first};

        Q23_MergeKSortedLists.Solution solution = new Q23_MergeKSortedLists.Solution();
        solution.mergeKLists(lists);
    }

    @Test
    void testExample3(){
        ListNode first = null;
        ListNode second = new ListNode(1);

        var lists = new ListNode[]{first, second};

        Q23_MergeKSortedLists.Solution solution = new Q23_MergeKSortedLists.Solution();
        solution.mergeKLists(lists);
    }

}