package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

@Category(QuestionCategory.HEAP)
public class Q215_KthLargestElementInAnArray {
    public static class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
            for (int num : nums) {
                priorityQueue.offer(num);
            }

            int sol = 0;
            while (k-- > 0) {
                sol = priorityQueue.poll();
            }
            return sol;
        }
    }
}
