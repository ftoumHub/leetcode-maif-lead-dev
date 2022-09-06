package fr.maif.leetcode.easy;

import static io.vavr.API.println;

/**
 * <div><p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>
 *
 * <p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <pre><strong>Input:</strong> x = 123
 * <strong>Output:</strong> 321
 * </pre><p><strong>Example 2:</strong></p>
 * <pre><strong>Input:</strong> x = -123
 * <strong>Output:</strong> -321
 * </pre><p><strong>Example 3:</strong></p>
 * <pre><strong>Input:</strong> x = 120
 * <strong>Output:</strong> 21
 * </pre><p><strong>Example 4:</strong></p>
 * <pre><strong>Input:</strong> x = 0
 * <strong>Output:</strong> 0
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
 * </ul>
 * </div>
 */
public class T0007_ReverseInteger {

    public static int reverse(int x) {
        final String result;
        final String xAsString = String.valueOf(x);

        try {
            if (xAsString.contains("-")) {
                final String s = xAsString.replaceAll("-", "");
                final StringBuilder reversed = new StringBuilder().append(s).reverse();
                result = "-" + reversed;
            } else {
                result = new StringBuilder().append(x).reverse().toString();
            }

            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        println("Résultat : " + reverse(123)); // 321
        println("Résultat : " + reverse(-123)); // -321
        println("Résultat : " + reverse(120)); // 21
        println("Résultat : " + reverse(0)); // 0
        println("Résultat : " + reverse(1534236469)); // 0
        println("Résultat : " + reverse(-1534236469)); // 0
    }
}
