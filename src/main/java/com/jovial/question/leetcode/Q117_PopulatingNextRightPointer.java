package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.question.leetcode.common.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;


@Category(value = QuestionCategory.BINARY_TREE)
public class Q117_PopulatingNextRightPointer {
    public static class Solution{
        public Node connect(Node root) {
            Map<Integer, Stack<Node>> sameHeightNode = new HashMap<>();
            traverse(root, 1, sameHeightNode);

            for(Stack<Node> heightNodes : sameHeightNode.values()){
                while(!heightNodes.empty()){
                    Node pop = heightNodes.pop();

                    if(!heightNodes.empty()){
                        pop.next = heightNodes.peek();
                    }else{
                        pop.next = null;
                    }
                }
            }
            return root;
        }

        private void traverse(Node current, int height, Map<Integer, Stack<Node>> sameHeightNode){
            if(Objects.isNull(current)) return;

            Stack<Node> heightNodes = sameHeightNode.getOrDefault(height, new Stack<>());
            heightNodes.push(current);
            sameHeightNode.put(height, heightNodes);

            traverse(current.right, height + 1 , sameHeightNode);
            traverse(current.left, height + 1 , sameHeightNode);
        }
    }
}
