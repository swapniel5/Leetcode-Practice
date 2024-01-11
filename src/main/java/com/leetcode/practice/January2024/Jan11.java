package com.leetcode.practice.January2024;

import java.util.Arrays;

public class Jan11 {

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println("Next Permutation: " + Arrays.toString(nums1));

        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2));

        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Next Permutation: " + Arrays.toString(nums3));
    }
}





