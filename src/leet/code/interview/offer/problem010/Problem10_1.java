package leet.code.interview.offer.problem010;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 *
 * @author wbxing
 * @date 2020/10/04
 */
public class Problem10_1 {

    public static void main(String[] args) {
        Problem10_1 problem10_1 = new Problem10_1();
        System.out.println(problem10_1.fib(10));
    }

    public int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 1000000007;
        }
        return result[n];
    }
}
