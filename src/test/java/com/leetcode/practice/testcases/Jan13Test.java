package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Jan13Test {

    // The method returns the correct result for a simple addition operation.
    @Test
    public void test_simple_addition_operation() {
        // Given
        String[] tokens = {"2", "3", "+"};

        // When
        int result = Jan13.evalRPN(tokens);

        // Then
        assertEquals(5, result);
    }

    // The method returns the correct result for a simple subtraction operation.
    @Test
    public void test_simple_subtraction_operation() {
        // Given
        String[] tokens = {"5", "2", "-"};

        // When
        int result = Jan13.evalRPN(tokens);

        // Then
        assertEquals(3, result);
    }

    // The method returns the correct result for a simple multiplication operation.
    @Test
    public void test_simple_multiplication_operation() {
        // Given
        String[] tokens = {"4", "3", "*"};

        // When
        int result = Jan13.evalRPN(tokens);

        // Then
        assertEquals(12, result);
    }

    // The method throws an exception when the input array is null.
    @Test
    public void test_input_array_is_null() {
        // Given
        String[] tokens = null;

        // When/Then
        assertThrows(NullPointerException.class, () -> {
            Jan13.evalRPN(tokens);
        });
    }

    // The method throws an exception when the input array contains an invalid token.
    @Test
    public void test_input_array_contains_invalid_token() {
        // Given
        String[] tokens = {"2", "3", "x"};

        // When/Then
        assertThrows(NumberFormatException.class, () -> {
            Jan13.evalRPN(tokens);
        });
    }
}
