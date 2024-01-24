package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Java24Test {


    // Decodes a string with a single set of brackets and a single digit.
    @Test
    public void test_decode_string_with_single_brackets_and_single_digit() {
        // Given
        String input = "3[a]";
        String expectedOutput = "aaa";

        // When
        String actualOutput = Jan24.decodeString(input);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

    // Decodes a string with multiple sets of brackets and digits.
    @Test
    public void test_decode_string_with_multiple_brackets_and_digits() {
        // Given
        String input = "3[a2[b]c]";
        String expectedOutput = "abbcabbcabbc";

        // When
        String actualOutput = Jan24.decodeString(input);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

    // Decodes a string with no brackets.
    @Test
    public void test_decode_string_with_no_brackets() {
        // Given
        String input = "abc";
        String expectedOutput = "abc";

        // When
        String actualOutput = Jan24.decodeString(input);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

    // Decodes an empty string.
    @Test
    public void test_decode_empty_string() {
        // Given
        String input = "";
        String expectedOutput = "";

        // When
        String actualOutput = Jan24.decodeString(input);

        // Then
        assertEquals(expectedOutput, actualOutput);
    }

}
