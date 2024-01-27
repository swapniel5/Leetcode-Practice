package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jan27Test {

    @Test
    public void test_positive_outcome() {
        int[] nums = {0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        int actualNums = Jan27.removeDuplicates(nums);
        assertEquals(5, actualNums);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4},
                expectedNums);
    }

    // The method returns the correct length of the modified array for a non-empty input array with no duplicates.
    @Test
    public void test_non_empty_array_no_duplicates() {
        // Given
        int[] nums = {1, 2, 3, 4, 5};

        // When
        int result = Jan27.removeDuplicates(nums);

        // Then
        assertEquals(5, result);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);
    }

    // The method returns the correct length of the modified array for a non-empty input array with duplicates.
    @Test
    public void test_non_empty_array_with_duplicates() {
        // Given
        int[] nums = {1, 1, 2, 2, 3, 3};
        int[] expectedNums = {1, 2, 3};
        // When
        int result = Jan27.removeDuplicates(nums);

        // Then
        assertEquals(3, result);
        assertArrayEquals(new int[]{1, 2, 3},
                expectedNums);
    }

    // The method returns 0 for an empty input array.
    @Test
    public void test_empty_array() {
        // Given
        int[] nums = {};

        // When
        int result = Jan27.removeDuplicates(nums);

        // Then
        assertEquals(0, result);
        assertArrayEquals(new int[]{}, nums);
    }

    // The method returns 1 for an input array with only one element.
    @Test
    public void test_single_element_array() {
        // Given
        int[] nums = {1};

        // When
        int result = Jan27.removeDuplicates(nums);

        // Then
        assertEquals(1, result);
        assertArrayEquals(new int[]{1}, nums);
    }

    // The method correctly modifies the input array to contain only duplicates.
    @Test
    public void test_modify_array_to_contain_duplicates() {
        // Given
        int[] nums = {1, 1, 1, 1, 1};
        int[] expectedNums = {1};
        // When
        int result = Jan27.removeDuplicates(nums);

        // Then
        assertEquals(1, result);
        assertArrayEquals(new int[]{1}, expectedNums);
    }

}