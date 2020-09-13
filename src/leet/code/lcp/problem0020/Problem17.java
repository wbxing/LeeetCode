package leet.code.lcp.problem0020;

/**
 * LCP 17. 速算机器人
 *
 * @author wbxing
 * @date 2020/09/12
 */
public class Problem17 {

    public static void main(String[] args) {
        Problem17 problem1 = new Problem17();

        System.out.println(problem1.calculate("AB"));
    }

    public int calculate(String s) {
        int x = 1;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }

        return x + y;
    }
}
