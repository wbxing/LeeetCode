package leet.code.problem5500;

import java.util.Arrays;

/**
 * 5496. 你可以获得的最大硬币数目
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem5496 {
    public static void main(String[] args) {
        Problem5496 problem02 = new Problem5496();
        System.out.println(problem02.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }


    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int total = 0;
        int index = piles.length - 2;
        for (int i = 0; i < piles.length / 3; i++) {
            total += piles[index];
            index -= 2;
        }
        return total;
    }
}
