package leet.code.problem0530;

/**
 * 521. 最长特殊序列 Ⅰ
 *
 * @author wbxing
 * @date 2020/10/09
 */
public class Problem521 {
    public static void main(String[] args) {
        Problem521 problem521 = new Problem521();
        System.out.println(problem521.findLUSlength("aaa", "bbb"));
    }

    public int findLUSlength(String a, String b) {
        if (a == null && b == null) {
            return -1;
        }
        if (a == null) {
            return b.length();
        }
        if (b == null) {
            return a.length();
        }
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
