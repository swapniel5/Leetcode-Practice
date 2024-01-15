package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Jan15Test {


    // Given a valid palindrome string, the method should return true.
    @Test
    public void test_valid_palindrome() {
        // Given
        String s = "A man, a plan, a canal: Panama";

        // When
        boolean result = Jan15.isPalindrome(s);

        // Then
        assertTrue(result);
    }

    // Given a valid non-palindrome string, the method should return false.
    @Test
    public void test_valid_non_palindrome() {
        // Given
        String s = "hello world";

        // When
        boolean result = Jan15.isPalindrome(s);

        // Then
        assertFalse(result);
    }

    // Given an empty string, the method should return true.
    @Test
    public void test_empty_string() {
        // Given
        String s = "";

        // When
        boolean result = Jan15.isPalindrome(s);

        // Then
        assertTrue(result);
    }

    // Given a string with leading or trailing spaces, the method should return true if the trimmed string is a palindrome.
    @Test
    public void test_string_with_spaces() {
        // Given
        String s = "  racecar  ";

        // When
        boolean result = Jan15.isPalindrome(s.trim());

        // Then
        assertTrue(result);
    }

    // Given a string with only spaces, the method should return true.
    @Test
    public void test_string_with_only_spaces() {
        // Given
        String s = "     ";

        // When
        boolean result = Jan15.isPalindrome(s);

        // Then
        assertTrue(result);
    }

    // Given a string with Unicode characters, the method should return true if the string is a palindrome.
    @Test
    public void test_unicode_string() {
        // Given
        String s = "😀🌍🌎🌏😀";

        // When
        boolean result = Jan15.isPalindrome(s);

        // Then
        assertTrue(result);
    }

}
