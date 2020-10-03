package leet.code.problem0330;

/**
 * 322. 零钱兑换
 *
 * @author wbxing
 * @date 2020/10/03
 */
public class Problem322 {
    public static void main(String[] args) {
        Problem322 problem322 = new Problem322();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(problem322.coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        int[] result = new int[amount + 1];
        result[0] = 0;
        for (int i = 1; i <= amount; i++) {
            result[i] = -1;
            for (int coin : coins) {
                if (i - coin >= 0 && result[i - coin] != -1) {
                    if (result[i] == -1) {
                        result[i] = result[i - coin] + 1;
                    } else {
                        result[i] = Math.min(result[i - coin] + 1, result[i]);
                    }
                }
            }
        }
        return result[amount];
    }
}
