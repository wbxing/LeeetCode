package leet.code.problem0070;

/**
 * 70. 爬楼梯
 * <p>
 * 斐波那契数列
 *
 * @author wbxing
 * @date 2020/08/20
 */
public class Problem70 {
    public static void main(String[] args) {
        Problem70 problem70 = new Problem70();
        System.out.println(problem70.climbStairs(2));

    }

    public int climbStairs1(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs(int n) {

        int current = 0;
        int next = 0;
        int result = 1;

        for (int i = 0; i < n; i++) {
            current = next;
            next = result;
            result = current + next;
        }
        return result;
    }
}
