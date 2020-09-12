package leet.code.interview.offer.problem010;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * @author wbxing
 * @date 2020/09/11
 */
public class Problem04 {

    public static void main(String[] args) {
        Problem04 problem04 = new Problem04();

        int[][] m = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};


        System.out.println(problem04.findNumberIn2DArray(m, 17));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {

            int current = matrix[i][j];
            if (current == target) {
                return true;
            }
            if (current > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
