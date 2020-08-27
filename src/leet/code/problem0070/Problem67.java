package leet.code.problem0070;

/**
 * 67. 二进制求和
 * <p>
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * @author wbxing
 * @date 2020/08/27
 */
public class Problem67 {
    public static void main(String[] args) {
        Problem67 problem67 = new Problem67();
        System.out.println(problem67.addBinary("1111", "111"));
    }

    public String addBinary(String a, String b) {

        if ("0".equals(a)) {
            return b;
        }
        if ("0".equals(b)) {
            return a;
        }
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        int len = Math.max(a.length(), b.length());
        if (a.length() < len) {
            sbA = fill(a, sbA, len);
        }
        if (b.length() < len) {
            sbB = fill(b, sbB, len);
        }
        StringBuilder res = new StringBuilder();
        int flag = 0;
        for (int i = len - 1; i >= 0; i--) {
            int num1 = Integer.parseInt(String.valueOf(sbA.charAt(i)));
            int num2 = Integer.parseInt(String.valueOf(sbB.charAt(i)));
            int sum = num1 + num2 + flag;
            if (sum == 0) {
                res.append(0);
                flag = 0;
            } else if (sum == 1) {
                res.append(1);
                flag = 0;
            } else if (sum == 2) {
                res.append(0);
                flag = 1;
            } else if (sum == 3) {
                res.append(1);
                flag = 1;
            } else {
                return "";
            }
        }
        if (flag == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }

    private StringBuilder fill(String str, StringBuilder src, int len) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < len - str.length(); i++) {
            tmp.append("0");
        }
        return src.reverse().append(tmp).reverse();
    }
}
