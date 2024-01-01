package January2024;

/*
TODO: 2839. Check if Strings Can be Made Equal With Operations I

You are given two strings s1 and s2, both of length 4, consisting of lowercase English letters.

You can apply the following operation on any of the two strings any number of times:

Choose any two indices i and j such that j - i = 2, then swap the two characters at those indices in the string.
Return true if you can make the strings s1 and s2 equal, and false otherwise.



Example 1:

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: We can do the following operations on s1:
- Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
- Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.
Example 2:

Input: s1 = "abcd", s2 = "dacb"
Output: false
Explanation: It is not possible to make the two strings equal.


Constraints:

s1.length == s2.length == 4
s1 and s2 consist only of lowercase English letters.*/
public class Jan1 {

    public static boolean canBeEqual(String s1, String s2) {
        if (s1.length() == s2.length()) {
            if (s1.charAt(0) != s2.charAt(0) && s1.charAt(2) != s2.charAt(2)) {
                if (s1.charAt(0) != s2.charAt(2) || s1.charAt(2) != s2.charAt(0)) {
                    return false;
                }
            } else if (s1.charAt(0) != s2.charAt(0) && s1.charAt(2) == s2.charAt(2) || s1.charAt(0) == s2.charAt(0) && s1.charAt(2) != s2.charAt(2)) {
                return false;
            }
            if (s1.charAt(1) != s2.charAt(1) && s1.charAt(3) != s2.charAt(3)) {
                return s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1);
            } else
                return (s1.charAt(1) != s2.charAt(1) || s1.charAt(3) == s2.charAt(3)) && (s1.charAt(1) == s2.charAt(1) || s1.charAt(3) != s2.charAt(3));
        }
        return false;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(canBeEqual(s1, s2)); // Output: true

        // Example 2
        s1 = "bnxw";
        s2 = "bwxn";

        System.out.println(canBeEqual(s1, s2)); // Output: false
    }
}



/*   public static boolean canMakeEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        // Check if the characters in both strings are the same
        if (!areCharactersSame(s1, s2)) {
            return false;
        }

        // Check if there is a valid pair of swaps that can make the strings equal
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == s2.charAt(i + 1) && s1.charAt(i + 1) == s2.charAt(i)) {
                return true;
            }
        }

        // Check for cyclic rotations
        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }

    private static boolean areCharactersSame(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        int i=0;
        int j = s1Array.length/2;

        for (int k = 0; k < j; k++) {
            char t = s1Array[k];
            s1Array[k] = s1Array[k+2];
            s1Array[k+2] =t;
        }




//        Arrays.sort(s1Array);
//        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }
*/
