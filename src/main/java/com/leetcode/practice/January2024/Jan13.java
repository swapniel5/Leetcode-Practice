package com.leetcode.practice.January2024;

import java.util.Objects;
import java.util.Stack;

public class Jan13 {
    public static void main(String[] args) {
        String[] polishNotationArray = {"10"};
        System.out.println("Result of Polish Notation: " + evalRPN(polishNotationArray));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (String token : tokens) {
            if (!Objects.equals(token, "+")
                    && !Objects.equals(token, "-")
                    && !Objects.equals(token, "*")
                    && !Objects.equals(token, "/")) {
                stack.push(token);
            } else {
                result = operation(token, stack);
                stack.push(String.valueOf(result));
            }
        }
        if (!stack.isEmpty())
            result = Integer.parseInt(stack.pop());
        return result;
    }

    private static int operation(String token, Stack<String> stack) {
        int result = 0;
        Integer num2 = Integer.parseInt(stack.pop());
        Integer num1 = Integer.parseInt(stack.pop());
        result = switch (token) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> result;
        };
        return result;
    }

}
