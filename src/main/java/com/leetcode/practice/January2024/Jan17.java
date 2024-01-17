package com.leetcode.practice.January2024;

import java.util.ArrayList;
import java.util.List;

/*TODO 22. Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
*/
public class Jan17 {

    /**
     * Generates all valid combinations of parentheses pairs given the number of pairs.
     *
     * @param n The number of pairs of parentheses.
     * @return A list of strings representing all valid combinations of parentheses pairs.
     */
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        // Helper function to generate all valid combinations of parentheses pairs
        generateParenthesisHelper(n, n, "", result);

        return result;
    }

    /**
     * Recursively generates all valid combinations of parentheses.
     *
     * @param left    The number of remaining left parentheses.
     * @param right   The number of remaining right parentheses.
     * @param current The current combination of parentheses.
     * @param result  The list to store the valid combinations.
     */
    private static void generateParenthesisHelper(int left, int right, String current, List<String> result) {
        // Base case: if both left and right parentheses are used up
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        // Recursive cases:
        // Add an open parenthesis if there are remaining left parentheses
        if (left > 0) {
            generateParenthesisHelper(left - 1, right, current + "(", result);
        }

        // Add a close parenthesis if there are remaining right parentheses and it won't create an invalid combination
        if (right > 0 && left < right) {
            generateParenthesisHelper(left, right - 1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 1;

        List<String> result1 = generateParenthesis(n1);
        List<String> result2 = generateParenthesis(n2);

        System.out.println("Output for n = 3: " + result1);
        System.out.println("Output for n = 1: " + result2);
    }
}
