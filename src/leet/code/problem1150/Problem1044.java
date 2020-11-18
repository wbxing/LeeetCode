package leet.code.problem1150;

import java.util.*;

/**
 * 1044. 最长重复子串
 *
 * @author wbxing
 * @date 2020/11/18
 */
public class Problem1044 {

    public static void main(String[] args) {
        Problem1044 problem1044 = new Problem1044();
        System.out.println(problem1044.longestDupSubstring("banana"));
    }

    public String longestDupSubstring(String S) {
        int n = S.length();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = (int) (S.charAt(i) - 'a');
        }

        int a = 26;
        long modulus = (long) Math.pow(2, 32);
        int left = 1, right = n;
        int L;
        while (left != right) {
            L = left + (right - left) / 2;
            if (search(L, a, modulus, n, nums) != -1) {
                left = L + 1;
            } else {
                right = L;
            }
        }
        int start = search(left - 1, a, modulus, n, nums);
        return start != -1 ? S.substring(start, start + left - 1) : "";
    }

    public int search(int L, int a, long modulus, int n, int[] nums) {
        long h = 0;
        for (int i = 0; i < L; i++) {
            h = (h * a + nums[i]) % modulus;
        }
        HashSet<Long> seen = new HashSet<>();
        seen.add(h);

        long aL = 1;
        for (int i = 1; i <= L; i++) {
            aL = (aL * a) % modulus;
        }
        for (int start = 1; start < n - L + 1; ++start) {
            h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
            h = (h + nums[start + L - 1]) % modulus;
            if (seen.contains(h)) {
                return start;
            }
            seen.add(h);
        }
        return -1;
    }

}
