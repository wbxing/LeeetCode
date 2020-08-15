package leet.code.problem0040;

/**
 * 外观数列
 *
 * @author wbxing
 * @date 2020/08/15
 */
public class Problem38 {

    public static void main(String[] args) {
        Problem38 problem38 = new Problem38();
        System.out.println(problem38.countAndSay(6));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        if (n == 3) {
            return "21";
        }
        if (n == 4) {
            return "1211";
        }
        if (n == 5) {
            return "111221";
        }

        StringBuilder sb = new StringBuilder();
        String preString = countAndSay(n - 1);

        int start = 0;
        for (int i = 1; i < preString.length(); i++) {
            if (preString.charAt(i) != preString.charAt(start)) {
                sb.append(i - start).append(preString.charAt(start));
                start = i;
            }
        }
        return sb.append(preString.length() - start).append(preString.charAt(start)).toString();
    }
}
