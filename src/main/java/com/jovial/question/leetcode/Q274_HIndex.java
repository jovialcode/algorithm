package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.BINARY_SEARCH)
public class Q274_HIndex {
    public static class Solution{
        public int hIndex(int[] citations){
            final int MAX_LENGTH = citations.length;
            //First Sorting.
            Arrays.sort(citations);

            int ans = MAX_LENGTH;
            for (; ans >=0 ; ans--) {
                int cnt = MAX_LENGTH - findInsertIndex(citations, ans);
                if(cnt >= ans) break;
            }
            return ans;
        }

        private int findInsertIndex(int[] arr, int value) {
            int left = 0;
            int right = arr.length;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] < value) left = mid + 1;
                else right = mid;
            }

            return left;
        }
    }
}
