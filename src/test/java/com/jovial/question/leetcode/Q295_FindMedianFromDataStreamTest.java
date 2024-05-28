package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q295_FindMedianFromDataStreamTest {
    @Test
    void testExample1(){
        Q295_FindMedianFromDataStream.MedianFinder medianFinder = new Q295_FindMedianFromDataStream.MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian());
        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian());
    }

}