package com.leetcode.practice.January2024;

import java.util.Objects;
import java.util.Stack;

public class Jan13 {
    public static void main(String[] args) {
        String[] polishNotationArray = {"10"};
        System.out.println("Result of Polish Notation: " + evalRPN(polishNotationArray));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperand(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(performOperation(token, num1, num2));
            }
        }
        return stack.pop();
    }

    private static boolean isOperand(String token) {
        return !token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/");
    }

    private static int performOperation(String operator, int num1, int num2) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
