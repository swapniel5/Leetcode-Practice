package com.leetcode.practice.January2024;

public class Jan25 {

    /**
     * Finds the longest common prefix among an array of strings.
     *
     * @param strs the array of strings
     * @return the longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { // if the array is empty
            return ""; // return an empty string
        }
        String prefix = strs[0]; // set the prefix to the first string in the array
        for (int i = 1; i < strs.length; i++) { // iterate through the array
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) { // find the common prefix
                j++;
            }
            prefix = prefix.substring(0, j); // update the prefix
            if (prefix.isEmpty()) { // if the prefix is empty
                return ""; // return an empty string
            }
        }
        return prefix; // return the longest common prefix
    }

    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        String output1 = longestCommonPrefix(input1);
        System.out.println("Output 1: " + output1);

        String[] input2 = {"dog", "racecar", "car"};
        String output2 = longestCommonPrefix(input2);
        System.out.println("Output 2: " + output2);
    }
}
