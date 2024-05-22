package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q25_ReverseNodesInKGroupTest {
    @Test
    void testExample1(){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        Q25_ReverseNodesInKGroup.Solution solution = new Q25_ReverseNodesInKGroup.Solution();
        solution.reverseKGroup(head, 2);
    }

    @Test
    void testExample2(){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        Q25_ReverseNodesInKGroup.Solution solution = new Q25_ReverseNodesInKGroup.Solution();
        solution.reverseKGroup(head, 3);
    }

    @Test
    void testExample3(){
        ListNode head = new ListNode(1);

        Q25_ReverseNodesInKGroup.Solution solution = new Q25_ReverseNodesInKGroup.Solution();
        solution.reverseKGroup(head, 1);
    }

    @Test
    void testExample4(){
        ListNode node2 = new ListNode(2);
        ListNode head = new ListNode(1, node2);

        Q25_ReverseNodesInKGroup.Solution solution = new Q25_ReverseNodesInKGroup.Solution();
        solution.reverseKGroup(head, 2);
    }
}