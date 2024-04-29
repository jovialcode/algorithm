package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q133_CloneGraphTest {
    @Test
    void testExample_1(){
        Q133_CloneGraph.Node node1 = new Q133_CloneGraph.Node(1);
        Q133_CloneGraph.Node node2 = new Q133_CloneGraph.Node(2);
        Q133_CloneGraph.Node node3 = new Q133_CloneGraph.Node(3);
        Q133_CloneGraph.Node node4 = new Q133_CloneGraph.Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Q133_CloneGraph.Solution solution = new Q133_CloneGraph.Solution();
        solution.cloneGraph(node1);
    }
}