package fr.maif.leetcode.easy;

import java.util.HashMap;

import static io.vavr.API.println;
import static java.util.Objects.isNull;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order
 * of characters. No two characters may map to the same character but a character may map to
 * itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 * <p>
 * Given "paper", "title", return true.
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 *
 * https://www.youtube.com/watch?v=B-qgcLN8mQM&t=588s
 */
public class T0205_IsomorphicStrings {

    // Function returns true if s and t are isomorphic
    public static boolean isIsomorphic(String s, String t) {
        if (isNull(s) || isNull(t) || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i); // e
            char ti = t.charAt(i); // a
            if (map.containsKey(si)) {
                if (map.get(si) != ti) {
                    return false;
                }
            } else if (map.containsValue(ti)) {
                return false;
            }
            map.put(si, ti); // e, a
        }
        return true;
    }

    public static void main(String[] args) {
        println("Résultat : " + isIsomorphic("egg", "add")); // true
        println("Résultat : " + isIsomorphic("foo", "bar")); // false
        println("Résultat : " + isIsomorphic("paper", "title")); // true
    }
}
