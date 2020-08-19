package leet.code.problem5490;

/**
 * 5488. 使数组中所有元素相等的最小操作数
 * <p>
 * 给你一个整数 n，即数组的长度。请你返回使数组 arr 中所有元素相等所需的 最小操作数 。
 *
 * @author wbxing
 * @date 2020/08/19
 */
public class Problem5488 {
    public static void main(String[] args) {
        Problem5488 problem5488 = new Problem5488();
        System.out.println(problem5488.minOperations(10000));
    }

    public int minOperations(int n) {
        int res = 0;
        for (int i = n; i > n / 2; i--) {
            res += (2 * (i - 1) + 1 - n);
        }
        return res;
    }
}
