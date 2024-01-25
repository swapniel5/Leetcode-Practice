package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jan25Test {


    // Returns the longest common prefix of an array of strings with multiple elements.
    @Test
    public void test_longest_common_prefix_multiple_elements() {
        // Given
        String[] input = {"flower", "flow", "flight"};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("fl", result);
    }

    // Returns the entire string if there is only one element in the array.
    @Test
    public void test_longest_common_prefix_single_element() {
        // Given
        String[] input = {"flower"};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("flower", result);
    }

    // Returns an empty string if the array is empty.
    @Test
    public void test_longest_common_prefix_empty_array() {
        // Given
        String[] input = {};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("", result);
    }

    // Returns an empty string if the array contains only empty strings.
    @Test
    public void test_longest_common_prefix_only_empty_strings() {
        // Given
        String[] input = {"", "", ""};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("", result);
    }

    // Returns an empty string if the array contains only one element, which is an empty string.
    @Test
    public void test_longest_common_prefix_single_empty_string() {
        // Given
        String[] input = {""};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("", result);
    }

    // Returns an empty string if the array contains elements with no common prefix.
    @Test
    public void test_longest_common_prefix_no_common_prefix() {
        // Given
        String[] input = {"dog", "racecar", "car"};

        // When
        String result = Jan25.longestCommonPrefix(input);

        // Then
        assertEquals("", result);
    }

}
