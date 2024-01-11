package com.leetcode.practice.January2024;

/*
* TODO 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false*/

import java.util.Stack;

public class Jan2 {
    public static void main(String[] args) {
        System.out.println(isValid("{([])}"));
        System.out.println(isValid("{([)}"));
        System.out.println(isValid("{[])}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> record = new Stack<Character>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[') {
                record.push(charArr[i]);
            } else if (charArr[i] == ')' && !record.isEmpty() && record.peek() == '(') {
                record.pop();
            } else if (charArr[i] == '}' && !record.isEmpty() && record.peek() == '{') {
                record.pop();
            } else if (charArr[i] == ']' && !record.isEmpty() && record.peek() == '[') {
                record.pop();
            } else return false;
        }
        return record.isEmpty();
    }
}
