package com.leetcode.practice.January2024;

import java.util.Stack;

/*
* TODO Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly
* k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed,
* etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those
* repeat numbers, k. For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.

* Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"

* Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"

* Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
*
* */

public class Jan24 {

    /**
     * Decodes a string that is encoded based on the number of times a substring should be repeated.
     *
     * @param s the encoded string
     * @return the decoded string
     */
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>(); // stack to store repeat counts
        Stack<String> resultStack = new Stack<>(); // stack to store partial results
        StringBuilder currentString = new StringBuilder(); // to store the current substring being built

        int count = 0; // initialize the repeat count

        for (char ch : s.toCharArray()) { // iterate through each character in the string
            if (Character.isDigit(ch)) { // if the character is a digit
                count = count * 10 + (ch - '0'); // update the repeat count
            } else if (ch == '[') { // if the character is '['
                countStack.push(count); // push the repeat count to the stack
                resultStack.push(currentString.toString()); // push the current string to the stack
                currentString = new StringBuilder(); // reset the current string
                count = 0; // reset the repeat count
            } else if (ch == ']') { // if the character is ']'
                int repeatCount = countStack.pop(); // get the repeat count
                StringBuilder temp = new StringBuilder(resultStack.pop()); // get the previous partial result
                for (int i = 0; i < repeatCount; i++) { // repeat the current substring based on the repeat count
                    temp.append(currentString);
                }
                currentString = temp; // update the current string with the repeated substring
            } else { // if the character is a letter
                currentString.append(ch); // append the character to the current string
            }
        }

        return currentString.toString(); // return the decoded string
    }

    public static void main(String[] args) {
        String input1 = "3[a]2[bc]";
        String output1 = decodeString(input1);
        System.out.println("Output 1: " + output1);

        String input2 = "3[a2[c]]";
        String output2 = decodeString(input2);
        System.out.println("Output 2: " + output2);

        String input3 = "2[abc]3[cd]ef";
        String output3 = decodeString(input3);
        System.out.println("Output 3: " + output3);
    }
}

