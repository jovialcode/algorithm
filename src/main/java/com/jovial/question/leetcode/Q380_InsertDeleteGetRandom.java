package com.jovial.question.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q380_InsertDeleteGetRandom {
    public static class RandomizedSet {
        private final Map<Integer, Integer> randomSet;

        public RandomizedSet() {
            this.randomSet = new HashMap<>();
        }

        // get Random cnt 0
        public boolean insert(int val) {
            if(hasValue(val)) return false;
            this.randomSet.put(val, 0);
            return true;
        }

        public boolean remove(int val) {
            if(!hasValue(val)) return false;
            this.randomSet.remove(val);
            return true;
        }

        public int getRandom() {
            Map.Entry<Integer, Integer> entry = this.randomSet.entrySet()
                    .stream()
                    .min(Map.Entry.comparingByValue())
                    .get();

            this.randomSet.put(entry.getKey(), entry.getValue() + 1);
            return entry.getKey();
        }

        private boolean hasValue(int val){
            return this.randomSet.containsKey(val);
        }
    }
}
