package fr.maif.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import static io.vavr.API.println;

/**
 * <div><p>Given an integer <code>numRows</code>, return the first numRows of <strong>Pascal's triangle</strong>.</p>
 *
 * <p>In <strong>Pascal's triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
 * <img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height:240px; width:260px">
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <pre><strong>Input:</strong> numRows = 5
 * <strong>Output:</strong> [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * </pre><p><strong>Example 2:</strong></p>
 * <pre><strong>Input:</strong> numRows = 1
 * <strong>Output:</strong> [[1]]
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= numRows &lt;= 30</code></li>
 * </ul>
 * </div>
 */
public class T0118_PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);

            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(Integer.sum(pre.get(j), pre.get(j+1)));
            }

            cur.add(1);

            result.add(cur);
            pre = cur;
        }

        return result;
    }

    public static void main(String[] args) {

        println("Résultat : " + generate(7));
    }
}
