package com.leetcode.practice.testcases;

import com.leetcode.practice.January2024.Jan1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Jan1Test {

    // Verify that the method returns true if s1 and s2 are equal.
    @Test
    public void test_equalStrings() {
        String s1 = "abcd";
        String s2 = "abcd";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertTrue(result);
    }

    // Verify that the method returns true if s1 and s2 are equal when swapped.
    @Test
    public void test_swappedStrings() {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertTrue(result);
    }

    // Verify that the method returns true if s1 and s2 are equal when swapped multiple times.
    @Test
    public void test_multipleSwaps() {
        String s1 = "abcd";
        String s2 = "dcba";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertFalse(result);
    }

    // Verify that the method returns false if s1 and s2 have different lengths.
    @Test
    public void test_differentLengths() {
        String s1 = "abcd";
        String s2 = "abcde";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertFalse(result);
    }

    // Verify that the method returns false if s1 and s2 have the same characters but in different positions.
    @Test
    public void test_differentPositions() {
        String s1 = "abcd";
        String s2 = "cdba";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertFalse(result);
    }

    // Verify that the method returns false if s1 and s2 have different characters.
    @Test
    public void test_differentCharacters() {
        String s1 = "abcd";
        String s2 = "efgh";
        boolean result = Jan1.canBeEqual(s1, s2);
        assertFalse(result);
    }
}
