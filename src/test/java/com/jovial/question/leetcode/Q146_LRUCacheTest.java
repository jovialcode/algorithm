package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q146_LRUCacheTest {
    @Test
    void testExample1() {
        int capacity = 2;

        List<Integer> ans = new ArrayList<>();
        Q146_LRUCache lruCache = new Q146_LRUCache(capacity);
        lruCache.put(1, 1);
        lruCache.put(2, 2);

        ans.add(lruCache.get(1));
        lruCache.put(3, 3);
        ans.add(lruCache.get(2));
        lruCache.put(4, 4);

        ans.add(lruCache.get(1));
        ans.add(lruCache.get(3));
        ans.add(lruCache.get(4));

        System.out.println(ans);
    }
}