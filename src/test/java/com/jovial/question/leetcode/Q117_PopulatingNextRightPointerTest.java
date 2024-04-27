package com.jovial.question.leetcode;

import com.jovial.question.leetcode.common.Node;
import org.junit.jupiter.api.Test;

public class Q117_PopulatingNextRightPointerTest {
    @Test
    void testExample_1(){

        Q117_PopulatingNextRightPointer.Solution solution = new Q117_PopulatingNextRightPointer.Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(7);
        Node connect = solution.connect(root);
        System.out.println(connect.val);
    }
}
