package leet.code.problem0180;

/**
 * 172. 阶乘后的零
 * <p>
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * @author wbxing
 * @date 2020/08/25
 */
public class Problem172 {
    public static void main(String[] args) {
        Problem172 problem172 = new Problem172();
        System.out.println(problem172.trailingZeroes(30));
    }

    public int trailingZeroes(int n) {
        int res = 0;
        long tmp = 5;
        while (tmp <= n) {
            res += (n / tmp);
            tmp *= 5;
        }
        return res;
    }
}
