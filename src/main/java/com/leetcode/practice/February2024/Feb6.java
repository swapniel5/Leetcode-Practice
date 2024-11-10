package com.leetcode.practice.February2024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* TODO 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*/
public class Feb6 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single element: " + singleNumber(nums));

        for(int i:nums){
            System.out.println(i);
        }
    }

    private static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
        /*
        List<Integer> integerList = IntStream.of(nums)
                .boxed()
                .toList();
        long num = integerList.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(
                        Map.Entry::getKey).collect();

        return (int) num;*/
    }
}
