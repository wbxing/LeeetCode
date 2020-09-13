package leet.code.problem0020;

/**
 * 12. 整数转罗马数字
 *
 * @author wbxing
 * @date 2020/09/13
 */
public class Problem12 {


    public static void main(String[] args) {
        Problem12 problem12 = new Problem12();
        System.out.println(problem12.intToRoman(3999));
    }

    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (num < 0) {
                break;
            }
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}

