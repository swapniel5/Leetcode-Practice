package com.leetcode.practice.January2024;

/*TODO 696. Count Binary Substrings
Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Example 1:
Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

Example 2:
Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
*/

public class Jan18 {
    public static int countBinarySubstrings(String s) {
        int result = 0, current = 1, previous = 0;

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                result += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }

        return result + Math.min(current, previous);
    }

    public static void main(String[] args) {
        String input = "00110011";
        int output = countBinarySubstrings(input);
        System.out.println("Output 1: " + output);
        input = "10101";
        output = countBinarySubstrings(input);
        System.out.println("Output 2: " + output);
    }
}
