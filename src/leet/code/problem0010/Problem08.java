package leet.code.problem0010;

/**
 * 字符串转换整数
 * <p>
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 *
 * @author wbxing
 * @date 2020/08/07
 */
public class Problem08 {

    public static void main(String[] args) {
        Problem08 problem08 = new Problem08();
        System.out.println(problem08.myAtoi("   +0 123"));
    }

    public int myAtoi(String str) {
        str = str.trim();
        StringBuilder sb = new StringBuilder();
        char negative = '-';
        char positive = '+';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == negative) {
                if (sb.length() == 0) {
                    sb.append(negative);
                    continue;
                } else {
                    break;
                }
            }
            if (str.charAt(i) == positive) {
                if (sb.length() == 0) {
                    sb.append(positive);
                    continue;
                } else {
                    break;
                }
            }
            if (!Character.isDigit(str.charAt(i))) {
                break;
            } else {
                sb.append(str.charAt(i));
            }
        }
        // System.out.println(sb.toString());
        if (sb.length() == 0) {
            return 0;
        }
        boolean flag = false;

        if (sb.toString().startsWith(String.valueOf(negative))) {
            flag = true;
        }
        char[] chars = sb.toString().toCharArray();
        int result = 0;
        for (char c : chars) {
            if (c == negative || c == positive) {
                continue;
            }
            int digit = Integer.parseInt(String.valueOf(c));
            // 检查越界
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            // 这里计算过程有可能越界
            result = result * 10 + digit;
        }
        return flag ? -result : result;
    }

}
