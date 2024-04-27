package com.jovial.question.leetcode;


import org.junit.jupiter.api.Test;

public class Q88_MergeSortedArrayTest {

    @Test
    public void testExample_1(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }

    @Test
    public void testExample_2(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }

    @Test
    public void testExample_3(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }

    @Test
    public void testExample_4(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }

    @Test
    public void testExample_5(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }

    @Test
    public void testExample_6(){
        Q88_MergeSortedArray.Solution solution = new Q88_MergeSortedArray.Solution();
        int[] nums1 = {4,0,0,0,0,0};
        int m = 1;
        int[] nums2 = {1,2,3,5,6};
        int n = 5;

        solution.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d ",nums1[i]);
        }
    }
}
