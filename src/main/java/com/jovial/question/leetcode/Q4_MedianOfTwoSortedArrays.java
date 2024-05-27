package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;

import java.util.ArrayList;
import java.util.List;

@Category(QuestionCategory.BINARY_SEARCH)
public class Q4_MedianOfTwoSortedArrays {
    public static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> nums = combine(nums1, nums2);

            if (nums.size() % 2 == 0) {
                int mid = nums.size() / 2;
                return (nums.get(mid - 1) + nums.get(mid)) / 2.0;
            } else {
                int mid = nums.size() / 2 + 1;
                return nums.get(mid - 1);
            }
        }

        private List<Integer> combine(int[] nums1, int[] nums2) {
            List<Integer> nums = new ArrayList<>();
            int i = 0, j = 0;

            while (i != nums1.length && j != nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    nums.add(nums1[i]);
                    i += 1;
                } else {
                    nums.add(nums2[j]);
                    j += 1;
                }
            }

            while (i != nums1.length) {
                nums.add(nums1[i]);
                i += 1;
            }

            while (j != nums2.length) {
                nums.add(nums2[j]);
                j += 1;
            }

            return nums;
        }
    }
}
