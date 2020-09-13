package leet.code.lcp.problem0020;

/**
 * LCP 19. 秋叶收藏集
 *
 * @author wbxing
 * @date 2020/09/13
 */
public class Problem19 {
    public static void main(String[] args) {
        Problem19 problem3 = new Problem19();
        System.out.println(problem3.minimumOperations("yyy"));
    }

    public int minimumOperations(String leaves) {
        if (leaves == null || leaves.length() < 3) {
            return -1;
        }

        int len = leaves.length();
        int[][] result = new int[len][3];
        result[0][0] = (leaves.charAt(0) == 'r' ? 0 : 1);
        for (int i = 1; i < len; i++) {
            result[i][0] = result[i - 1][0] + (leaves.charAt(i) == 'r' ? 0 : 1);
            result[i][1] = result[i - 1][0] + (leaves.charAt(i) == 'y' ? 0 : 1);
            if (i > 1) {
                result[i][1] = Math.min(result[i][1], result[i - 1][1] + (leaves.charAt(i) == 'y' ? 0 : 1));
                result[i][2] = result[i - 1][1] + (leaves.charAt(i) == 'r' ? 0 : 1);
            }
            if (i > 2) {
                result[i][2] = Math.min(result[i][2], result[i - 1][2] + (leaves.charAt(i) == 'r' ? 0 : 1));
            }
        }
        return result[len - 1][2];
    }
}
