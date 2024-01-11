package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Jan11Test {


    // The method 'nextPermutation' correctly generates the next permutation of a given array of integers.
    @Test
    public void test_next_permutation_generates_next_permutation() {
        // Given
        int[] nums = {1, 2, 3};

        // When
        Jan11.nextPermutation(nums);

        // Then
        assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    // The method 'nextPermutation' correctly handles the case where the input array is already the last permutation.
    @Test
    public void test_next_permutation_handles_last_permutation() {
        // Given
        int[] nums = {3, 2, 1};

        // When
        Jan11.nextPermutation(nums);

        // Then
        assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    // The method 'swap' correctly swaps two elements in an array of integers.
    @Test
    public void test_swap_correctly_swaps_elements() {
        // Given
        int[] nums = {1, 2, 3};

        // When
        Jan11.swap(nums, 0, 2);

        // Then
        assertArrayEquals(new int[]{3, 2, 1}, nums);
    }

    // The method 'nextPermutation' correctly handles the case where the input array is empty.
    @Test
    public void test_next_permutation_handles_empty_array() {
        // Given
        int[] nums = {};

        // When
        Jan11.nextPermutation(nums);

        // Then
        assertArrayEquals(new int[]{}, nums);
    }

    // The method 'nextPermutation' correctly handles the case where the input array has only one element.
    @Test
    public void test_next_permutation_handles_single_element_array() {
        // Given
        int[] nums = {1};

        // When
        Jan11.nextPermutation(nums);

        // Then
        assertArrayEquals(new int[]{1}, nums);
    }

    // The method 'nextPermutation' correctly handles the case where the input array has duplicate elements.
    @Test
    public void test_next_permutation_handles_duplicate_elements() {
        // Given
        int[] nums = {1, 1, 5};

        // When
        Jan11.nextPermutation(nums);

        // Then
        assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

}
