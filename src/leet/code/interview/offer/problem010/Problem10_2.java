package leet.code.interview.offer.problem010;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 *
 * @author wbxing
 * @date 2020/10/04
 */
public class Problem10_2 {
    public static void main(String[] args) {
        Problem10_2 problem10_2 = new Problem10_2();
        System.out.println(problem10_2.numWays(200));
    }

    public int numWays(int n) {
        if (n < 2) {
            return 1;
        }
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = (ways[i - 1] + ways[i - 2]) % 1000000007;
        }
        return ways[n];
    }
}
