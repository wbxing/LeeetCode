package leet.code.problem0130;

/**
 * 122. 买卖股票的最佳时机 II
 *
 * @author wbxing
 * @date 2020/09/02
 */
public class Problem122 {
    public static void main(String[] args) {
        Problem122 problem122 = new Problem122();
        System.out.println(problem122.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int index = 0;
        int maxProfit = 0;
        while (index < prices.length - 1) {
            while (index < prices.length - 1 && prices[index] >= prices[index + 1]) {
                index++;
            }
            int valley = prices[index];
            while (index < prices.length - 1 && prices[index] <= prices[index + 1]) {
                index++;
            }
            int peak = prices[index];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }

}
