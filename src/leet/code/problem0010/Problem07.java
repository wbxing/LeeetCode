package leet.code.problem0010;

/**
 * 整数反转
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Problem07 {

    public static void main(String[] args) {
        Problem07 problem7 = new Problem07();
        System.out.println(problem7.reverse(-2147483648));
    }

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        boolean flag = false;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
            flag = true;
        }
        long res = Long.parseLong(sb.reverse().toString());
        if (flag) {
            res = -res;
        }
        if (res > 2147483647 || res < -2147483648) {
            return 0;
        }

        return (int) res;
    }
}
