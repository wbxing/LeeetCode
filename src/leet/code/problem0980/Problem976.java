package leet.code.problem0980;

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 *
 * @author wbxing
 * @date 2020/11/29
 */
public class Problem976 {
    public static void main(String[] args) {
        Problem976 problem976 = new Problem976();
        System.out.println(problem976.largestPerimeter(new int[]{2, 1, 2}));
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}
