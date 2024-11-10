package com.leetcode.practice.November;


/* TODO: Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] numbs = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxArrayApproach1(numbs));
        System.out.println(maxArrayApproach2(numbs));

        int[] numbs2 = {-1};
        System.out.println(maxArrayApproach1(numbs2));
        System.out.println(maxArrayApproach2(numbs2));
    }

    public static int maxArrayApproach1(int[] numbs) {
        int sum = 0, maxSum = 0;
        for (int numb : numbs) {
            sum += numb;
            if (maxSum < sum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }

    public static int maxArrayApproach2(int[] numbs) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int numb : numbs) {
            currentSum = Math.max(numb, currentSum + numb);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}


