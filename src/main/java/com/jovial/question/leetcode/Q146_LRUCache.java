package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.*;

@Category(QuestionCategory.HASH_TABLE)
public class Q146_LRUCache {
    //value, timeline
    private int time;
    private final int[] values;
    private final int capacity;
    private final HashMap<Integer, Integer> cache;
    private final Queue<Unit> leastRecentlyQueue;

    public Q146_LRUCache(int capacity) {
        this.time = 0;
        this.capacity = capacity;
        this.values = new int[10001];
        Arrays.fill(this.values, -1);
        this.cache = new LinkedHashMap<>(capacity);
        this.leastRecentlyQueue = new PriorityQueue<>();
    }

    public int get(int key) {
        int value = -1;
        if (cache.containsKey(key)) {
            value = values[key];
            if (value != -1) {
                this.cache.put(key, time);
                this.leastRecentlyQueue.add(new Unit(time++, key));
            }
        }

        return value;
    }

    public void put(int key, int value) {
        boolean exist = cache.containsKey(key);
        boolean full = cache.size() == capacity;

        if (full && !exist) {
            int target = deleteTarget(key);
            if (target != -1) cache.remove(target);
        }

        values[key] = value;
        cache.put(key, time);
        leastRecentlyQueue.add(new Unit(time++, key));
    }

    private int deleteTarget(int key) {
        int target = -1;
        while (!leastRecentlyQueue.isEmpty()) {
            Unit poll = leastRecentlyQueue.poll();
            Integer time = cache.get(poll.value);

            if (poll.time != time) {
                continue;
            }

            target = poll.value;
            break;
        }
        return target;
    }

    private class Unit implements Comparable<Unit> {
        int time;
        int value;

        public Unit(int time, int value) {
            this.time = time;
            this.value = value;
        }

        //reverse
        @Override
        public int compareTo(Unit o) {
            return Integer.compare(this.time, o.time);
        }
    }
}
