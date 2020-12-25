package leet.code.problem0460;

import java.util.Arrays;

/**
 * 455. 分发饼干
 *
 * @author wbxing
 * @date 2020/12/25
 */
public class Problem455 {

    public static void main(String[] args) {
        Problem455 problem455 = new Problem455();
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 1};
        System.out.println(problem455.findContentChildren(g, s));

    }

    public int findContentChildren(int[] g, int[] s) {
        if (s == null || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);

        int cnt = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            while (j < s.length && s[j] < g[i]) {
                j++;
            }
            if (j < s.length) {
                cnt++;
            }
        }
        return cnt;
    }

}
