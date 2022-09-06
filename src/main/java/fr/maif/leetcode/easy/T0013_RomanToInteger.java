package fr.maif.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

import static io.vavr.API.println;

/**
 * <div><p>Roman numerals are represented by seven different symbols:&nbsp;<code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.</p>
 *
 * <pre><strong>Symbol</strong>       <strong>Value</strong>
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000</pre>
 *
 * <p>For example,&nbsp;<code>2</code> is written as <code>II</code>&nbsp;in Roman numeral, just two one's added together. <code>12</code> is written as&nbsp;<code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.</p>
 *
 * <p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>
 *
 * <ul>
 * 	<li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.&nbsp;</li>
 * 	<li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.&nbsp;</li>
 * 	<li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
 * </ul>
 *
 * <p>Given a roman numeral, convert it to an integer.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "III"
 * <strong>Output:</strong> 3
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "IV"
 * <strong>Output:</strong> 4
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "IX"
 * <strong>Output:</strong> 9
 * </pre>
 *
 * <p><strong>Example 4:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "LVIII"
 * <strong>Output:</strong> 58
 * <strong>Explanation:</strong> L = 50, V= 5, III = 3.
 * </pre>
 *
 * <p><strong>Example 5:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "MCMXCIV"
 * <strong>Output:</strong> 1994
 * <strong>Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= s.length &lt;= 15</code></li>
 * 	<li><code>s</code> contains only&nbsp;the characters <code>('I', 'V', 'X', 'L', 'C', 'D', 'M')</code>.</li>
 * 	<li>It is <strong>guaranteed</strong>&nbsp;that <code>s</code> is a valid roman numeral in the range <code>[1, 3999]</code>.</li>
 * </ul>
 * </div>
 */
public class T0013_RomanToInteger {

    public static int romanToInt(String s) {
        if (s.length() < 1 || s.length() > 15) {
            throw new IllegalArgumentException("s should be between 1 and 15 characters");
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4); //
        map.put("V", 5);
        map.put("IX", 9); //
        map.put("X", 10);
        map.put("XL", 40); //
        map.put("L", 50);
        map.put("XC", 90); //
        map.put("C", 100);
        map.put("CD", 400); //
        map.put("D", 500);
        map.put("CM", 900); //
        map.put("M", 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++){ // On parcourt la chaine en entrée
            final char c = s.charAt(i); // On prend un caractère
            String romNumKey = Character.toString(c);

            if (i < s.length() - 1) {
                final char nextChar = s.charAt(i + 1);
                if (c == 'I' &&  estSuiviDe(nextChar, 'V', 'X')) {
                    romNumKey = Character.toString('I') + nextChar;
                    i++;
                }
                if (c == 'X' &&  ('L' == nextChar || 'C' == nextChar)) {
                    romNumKey = Character.toString('X') + nextChar;
                    i++;
                }
                if (c == 'C' &&  ('D' == nextChar || 'M' == nextChar)) {
                    romNumKey = Character.toString('C') + nextChar;
                    i++;
                }
            }
            sum += map.get(romNumKey);
        }

        return sum;
    }

    private static boolean estSuiviDe(char nextChar, char par, char ou) {
        return par == nextChar || ou == nextChar;
    }

    public static void main(String[] args) {
        println("Résultat : " + romanToInt("III")); // 3
        println("Résultat : " + romanToInt("IV")); // 4
        println("Résultat : " + romanToInt("IX")); // 9
        println("Résultat : " + romanToInt("LVIII")); // 58
        println("Résultat : " + romanToInt("MCMXCIV")); // 1994
        println("Résultat : " + romanToInt("MMMDCCCLXXXVIII")); // 3888
    }
}
