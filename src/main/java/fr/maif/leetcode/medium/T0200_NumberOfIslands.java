package fr.maif.leetcode.medium;

import java.util.Arrays;

import static io.vavr.API.println;

/**
 * <div><p>Given an <code>m x n</code> 2D binary grid <code>grid</code> which represents a map of <code>'1'</code>s (land) and <code>'0'</code>s (water), return <em>the number of islands</em>.</p>
 *
 * <p>An <strong>island</strong> is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * <strong>Output:</strong> 1
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * <strong>Output:</strong> 3
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>m == grid.length</code></li>
 * 	<li><code>n == grid[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 300</code></li>
 * 	<li><code>grid[i][j]</code> is <code>'0'</code> or <code>'1'</code>.</li>
 * </ul>
 * </div>
 */
public class T0200_NumberOfIslands {

    static int count = 0;
    public static int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            println("=> processing line "+ i);
            for (int j = 0; j < grid[i].length; j++) {
                println("c"+ j);
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0
                || j >= grid[0].length || grid[i][j] == '0')
            return ;

        println("processing cell("+i+","+j+")");
        println(Arrays.deepToString(grid));
        grid[i][j] = '0';
        println(Arrays.deepToString(grid));
        callBFS(grid, i-1, j); //up
        println(Arrays.deepToString(grid));
        callBFS(grid, i+1, j); //down
        println(Arrays.deepToString(grid));
        callBFS(grid, i, j-1); //left
        println(Arrays.deepToString(grid));
        callBFS(grid, i, j+1); //right
        println(Arrays.deepToString(grid));
    }

    public static void main(String[] args) {
        char[][] grid1 = new char[][] {
                { '1','1','1','1','0' },
                { '1','1','0','1','0' },
                { '1','1','0','0','0' },
                { '0','0','0','0','0' }
        };

        char[][] grid2 = new char[][] {
                { '1','1','0','0','0' },
                { '1','1','0','0','0' },
                { '1','0','1','0','0' },
                { '0','0','0','1','1' }
        };

        println(numIslands(grid1)); // 1

        println(numIslands(grid2)); // 3
    }
}
