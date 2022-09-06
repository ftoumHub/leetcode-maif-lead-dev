package fr.maif.leetcode.easy;

import static io.vavr.API.println;

/**
 * <div><p>Write a function to find the longest common prefix string amongst an array of strings.</p>
 *
 * <p>If there is no common prefix, return an empty string <code>""</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> strs = ["flower","flow","flight"]
 * <strong>Output:</strong> "fl"
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> strs = ["dog","racecar","car"]
 * <strong>Output:</strong> ""
 * <strong>Explanation:</strong> There is no common prefix among the input strings.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= strs.length &lt;= 200</code></li>
 * 	<li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
 * 	<li><code>strs[i]</code> consists of only lower-case English letters.</li>
 * </ul>
 * </div>
 */
public class T0014_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        return "";
    }

    public static void main(String[] args) {
        println("Résultat : " + longestCommonPrefix(new String[]{"flower","flow","flight"})); // "fl"

        println("Résultat : " + longestCommonPrefix(new String[]{"dog","racecar","car"})); // ""
    }
}
