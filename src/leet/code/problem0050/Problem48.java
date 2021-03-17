package leet.code.problem0050;

import java.util.Arrays;

/**
 * 48. 旋转图像
 * @author wbxing
 * @date 2021/03/17
 */
public class Problem48 {

    public static void main(String[] args) {
        Problem48 problem48 = new Problem48();
        int[][] m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        problem48.rotate(m);
        System.out.println(Arrays.deepToString(m));
    }

    public void rotate(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int length = matrix.length;
        if (length <= 1) {
            return;
        }

        int[][] newMatrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                newMatrix[j][length - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < length; ++i) {
            System.arraycopy(newMatrix[i], 0, matrix[i], 0, length);
        }
    }
}
