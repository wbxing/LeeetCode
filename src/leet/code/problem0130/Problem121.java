package leet.code.problem0130;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author wbxing
 * @date 2020/09/02
 */
public class Problem121 {
    public static void main(String[] args) {
        Problem121 problem121 = new Problem121();
        System.out.println(problem121.maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        // int[] profit = new int[prices.length];
        int minPrice = prices[0];
        int maxProfit = 0;
        prices[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // prices[i] = prices[i] - minPrice;
            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
