package fr.maif.leetcode.easy;

import static io.vavr.API.println;

/**
 * <p>Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is palindrome integer.</p>
 *
 * <p>An integer is a <strong>palindrome</strong> when it reads the same backward as forward.
 * For example, <code>121</code> is palindrome while <code>123</code> is not.</p>
 */
public class T0009_PalindromeNumber {

    public static boolean isPalindrome(int x) {
        try {
            final String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
            return x == Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        println("Résultat : " + isPalindrome(121)); // true

        println("Résultat : " + isPalindrome(-121)); // false

        println("Résultat : " + isPalindrome(14241)); // true
    }
}
