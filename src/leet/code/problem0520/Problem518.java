package leet.code.problem0520;

/**
 * 518. 零钱兑换 II
 *
 * @author wbxing
 * @date 2020/10/03
 */
public class Problem518 {
    public static void main(String[] args) {
        Problem518 problem519 = new Problem518();
        System.out.println(problem519.change(5, new int[]{1, 2, 5}));
    }

    public int change(int amount, int[] coins) {
        if (amount < 0) {
            return 0;
        }
        int[] result = new int[amount + 1];
        result[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                result[i] += result[i - coin];
            }
        }
        return result[amount];
    }
}
