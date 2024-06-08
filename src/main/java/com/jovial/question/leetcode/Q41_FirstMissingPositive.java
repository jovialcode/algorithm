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

    public static class Solution2 {
        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public int firstMissingPositive(int[] nums) {
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                }
            }

            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }

            return n + 1;
        }
    }
}
