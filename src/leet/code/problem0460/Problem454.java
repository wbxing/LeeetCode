package leet.code.problem0460;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 *
 * @author wbxing
 * @date 2020/11/27
 */
public class Problem454 {

    public static void main(String[] args) {
        Problem454 problem454 = new Problem454();
        int[] a = new int[]{1, 2};
        int[] b = new int[]{-2, -1};
        int[] c = new int[]{-1, 2};
        int[] d = new int[]{0, 2};
        System.out.println(problem454.fourSumCount(a, b, c, d));
    }


    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : a) {
            for (int j : b) {
                count.put(i + j, count.getOrDefault(i + j, 0) + 1);
            }
        }
        int result = 0;
        for (int i : c) {
            for (int j : d) {
                if (count.containsKey(-i - j)) {
                    result += count.get(-i - j);
                }
            }
        }
        return result;
    }
}
