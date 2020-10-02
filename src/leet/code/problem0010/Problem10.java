package leet.code.problem0010;

/**
 * 10. 正则表达式匹配
 *
 * @author wbxing
 * @date 2020/10/02
 */
public class Problem10 {

    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        System.out.println(problem10.isMatch("aa", "a*"));
    }

    public boolean isMatch(String s, String p) {

        if (s == null && p == null) {
            return true;
        }
        if (s == null || p == null) {
            return false;
        }
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] f = new boolean[sLen + 1][pLen + 1];
        f[0][0] = true;
        for (int i = 0; i <= sLen; ++i) {
            for (int j = 1; j <= pLen; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[sLen][pLen];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
