package leet.code.problem0210;

/**
 * 201. 数字范围按位与
 * <p>
 * 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem201 {
    public static void main(String[] args) {
        Problem201 problem201 = new Problem201();
        System.out.println(problem201.rangeBitwiseAnd(5, 7));
    }

    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == n) {
            return m;
        }
        int index = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            index++;
        }
        return m << index;
    }
}
