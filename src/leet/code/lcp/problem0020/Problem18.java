package leet.code.lcp.problem0020;

import java.util.Arrays;

/**
 * LCP 18. 早餐组合
 *
 * @author wbxing
 * @date 2020/09/12
 */
public class Problem18 {

    public static void main(String[] args) {
        Problem18 problem2 = new Problem18();
        int[] staple = new int[]{10, 20, 5};
        int[] drinks = new int[]{8, 9, 5, 1};
        System.out.println(problem2.breakfastNumber(staple, drinks, 15));
    }

    public int breakfastNumber(int[] staple, int[] drinks, int x) {

        Arrays.sort(staple);
        Arrays.sort(drinks);
        int sum = 0;
        if (staple[0] >= x || drinks[0] >= x) {
            return 0;
        }
        for (int sta : staple) {
            if (sta >= x) {
                break;
            }
            int money = x - sta;
            if (money < drinks[0]) {
                break;
            }
            if (money >= drinks[drinks.length - 1]) {
                sum += drinks.length;
                continue;
            }

            int left = 0;
            int right = drinks.length - 1;
            int num = (left + right) / 2;
            while (drinks[num] > money || drinks[num + 1] <= money) {
                if (drinks[num + 1] <= money) {
                    left = num + 1;
                }
                if (drinks[num] > money) {
                    right = num;
                }
                num = (left + right) / 2;
            }
            sum += (num + 1);
        }
        return sum % 1000000007;
    }
}
