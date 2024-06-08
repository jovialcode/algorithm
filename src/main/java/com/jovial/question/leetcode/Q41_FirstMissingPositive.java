package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.Arrays;

@Category(QuestionCategory.EFFICIENCY)
public class Q41_FirstMissingPositive {
    public static class Solution {
        public int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);

            int positive = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    positive = i;
                    break;
                }
            }

            if (positive == -1) return 1;

            //
            int p = positive, q = positive + 1;
            while (p < nums.length && q < nums.length) {
                if (nums[p] != nums[q]) {
                    if (q - p == 1) {
                        p++;
                        q++;
                    } else {
                        p++;
                        nums[p] = nums[q];
                        q++;
                    }
                } else {
                    q++;
                }
            }
            //
            int ans = 1;
            for (int i = positive; i <= p; i++, ans++) {
                if (nums[i] != ans) {
                    if (nums[i] > ans) return ans;
                    else return nums[i];
                }
            }
            return nums[p] + 1;
        }
    }
}
