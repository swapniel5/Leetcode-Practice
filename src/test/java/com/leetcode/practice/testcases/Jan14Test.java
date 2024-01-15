package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jan14Test {


    // Returns the reverse of a positive integer.
    @Test
    public void test_reverse_positive_integer() {
        // Given
        int input = 123;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(321, result);
    }

    // Returns the reverse of a negative integer.
    @Test
    public void test_reverse_negative_integer() {
        // Given
        int input = -456;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(-654, result);
    }

    // Returns 0 when input is 0.
    @Test
    public void test_reverse_zero_input() {
        // Given
        int input = 0;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(0, result);
    }

    // Returns 0 when the reversed integer overflows.
    @Test
    public void test_reverse_overflow() {
        // Given
        int input = 2147483647;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(0, result);
    }

    // Returns 0 when the reversed integer underflows.
    @Test
    public void test_reverse_underflow() {
        // Given
        int input = -2147483648;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(0, result);
    }

    // Returns 0 when input is greater than or equal to 2147483647.
    @Test
    public void test_reverse_input_greater_than_max() {
        // Given
        int input = 2147483647;

        // When
        int result = Jan14.reverse(input);

        // Then
        assertEquals(0, result);
    }

}
