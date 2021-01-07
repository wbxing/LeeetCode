package leet.code.problem0510;

/**
 * 509. 斐波那契数
 *
 * @author wbxing
 * @date 2021/01/04
 */
public class Problem509 {

    public static void main(String[] args) {
        Problem509 problem509 = new Problem509();
        System.out.println(problem509.fib(4));
    }

    public int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int[] fibs = new int[n + 1];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        return fibs[n];
    }
}
