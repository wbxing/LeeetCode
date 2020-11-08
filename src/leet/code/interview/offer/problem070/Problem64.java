package leet.code.interview.offer.problem070;

/**
 * 剑指 Offer 64. 求1+2+…+n
 *
 * @author wbxing
 * @date 2020/11/08
 */
public class Problem64 {
    public static void main(String[] args) {
        Problem64 problem64 = new Problem64();
        System.out.println(problem64.sumNums(10));
    }

    public int sumNums(int n) {
        // 短路原则
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
