package leet.code.lcp.problem0010;

/**
 * LCP 06. 拿硬币
 *
 * @author wbxing
 * @date 2020/10/03
 */
public class Problem06 {

    public static void main(String[] args) {
        Problem06 problem06 = new Problem06();
        System.out.println(problem06.minCount(new int[]{1, 2, 4}));
    }

    public int minCount(int[] coins) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        int result = 0;
        for (int coin : coins) {
            result += coin / 2;
            if (coin % 2 != 0) {
                result += 1;
            }
        }
        return result;
    }
}
