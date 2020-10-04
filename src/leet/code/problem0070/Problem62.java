package leet.code.problem0070;

import java.util.HashSet;
import java.util.Set;

/**
 * 62. 不同路径
 *
 * @author wbxing
 * @date 2020/10/04
 */
public class Problem62 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Problem62 problem62 = new Problem62();
        System.out.println(problem62.uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        int[][] path = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    path[i][j] = 1;
                } else {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }
        return path[m - 1][n - 1];
    }
}
