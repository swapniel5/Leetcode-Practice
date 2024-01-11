package January2024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Jan4 {
    public static void main(String[] args) {
        String input1 = "ab";
        String input2 = "abca";
        String input3 = "abc";

        System.out.println("Is '" + input1 + "' a valid palindrome? " + validPalindrome(input1));
        System.out.println("Is '" + input2 + "' a valid palindrome? " + validPalindrome(input2));
        System.out.println("Is '" + input3 + "' a valid palindrome? " + validPalindrome(input3));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
