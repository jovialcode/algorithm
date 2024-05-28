package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.common.annotation.Explanation;

import java.util.ArrayList;
import java.util.List;

@Category(QuestionCategory.BINARY_SEARCH)
@Explanation("Fastest solution is calving the list into 2 priority queues. " +
    "one queue has small values and the other has large values than small queue." +
    "small queue must save reversely so that peek operation get largest value among the small queue" +
    "and peek large queue that is that"
)
public class Q295_FindMedianFromDataStream {
    public static class MedianFinder {
        private final List<Integer> nums;
        private int medianPointer;

        public MedianFinder() {
            nums = new ArrayList<>();
            medianPointer = 0;
        }

        public void addNum(int num) {
            nums.add(findPos(num), num);
            adjustMedian();
        }

        private int findPos(int num){
            if(nums.size() == 0) return 0;

            if(num > nums.get(medianPointer))
                return findPos(medianPointer, this.nums.size(), num);
            return findPos(0, medianPointer, num);
        }

        private int findPos(int from, int to, int num){
            if(from >= to) return from;
            int mid = (to + from) / 2;

            if(num > nums.get(mid)) return findPos(mid + 1, to, num);
            return findPos(0, mid, num);
        }

        private void adjustMedian() {
            int mid = nums.size() / 2;
            medianPointer = nums.size() % 2 == 0 ? mid - 1 : mid;
        }

        public double findMedian() {
            if (nums.size() % 2 == 0)
                return (nums.get(medianPointer) + nums.get(medianPointer + 1)) / 2.0;
            return nums.get(medianPointer);
        }
    }
}
