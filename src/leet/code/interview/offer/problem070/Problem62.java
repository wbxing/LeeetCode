package leet.code.interview.offer.problem070;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * <p>
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 * @author wbxing
 */
public class Problem62 {

    public static void main(String[] args) {
        Problem62 problem62 = new Problem62();
        System.out.println(problem62.lastRemaining(5, 3));
    }

    public int lastRemaining(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int result = lastRemaining(n - 1, m);
        return (m + result) % n;
    }
}
