package leet.code.interview.offer.problem020;

/**
 * 剑指 Offer 19. 正则表达式匹配
 *
 * @author wbxing
 * @date 2020/11/14
 */
public class Problem19 {

    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();
        System.out.println(problem19.isMatch("aa", "a*"));

    }

    public boolean isMatch(String strA, String strB) {
        int lenA = strA.length();
        int lenB = strB.length();
        boolean[][] f = new boolean[lenA + 1][lenB + 1];

        for (int i = 0; i <= lenA; i++) {
            for (int j = 0; j <= lenB; j++) {
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    if (strB.charAt(j - 1) != '*') {
                        if (i > 0 && (strA.charAt(i - 1) == strB.charAt(j - 1) || strB.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        if (i >= 1 && j >= 2 && (strA.charAt(i - 1) == strB.charAt(j - 2) || strB.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }

        }
        return f[lenA][lenB];
    }
}
