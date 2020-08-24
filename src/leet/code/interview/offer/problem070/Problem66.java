package leet.code.interview.offer.problem070;

import java.util.Arrays;

/**
 * 66. 加一
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * @author wbxing
 * @date 2020/08/24
 */
public class Problem66 {
    public static void main(String[] args) {
        Problem66 problem66 = new Problem66();
        System.out.println(Arrays.toString(problem66.plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9})));
    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i]++;
            return digits;
        }
        int[] res = new int[digits.length + 1];
        // 可有可无
        // System.arraycopy(digits, 0, res, 1, digits.length);
        res[0] = 1;
        return res;
    }
}
