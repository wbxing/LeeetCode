package leet.code.problem0010;

/**
 * 5. 最长回文子串
 * <p>
 * 中心扩展法
 *
 * @author wbxing
 * @date 2020/09/03
 */
public class Problem05 {
    public static void main(String[] args) {
        Problem05 problem05 = new Problem05();
        System.out.println(problem05.longestPalindrome("aaaaaaaa"));
    }

    public String longestPalindrome1(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        String result = String.valueOf(s.charAt(0));
        // System.out.println("result = " + result);
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                String substring = s.substring(i, j + 1);
                // System.out.println("substring = " + substring);
                if (palindrome(substring) && substring.length() > result.length()) {
                    result = substring;
                    break;
                }
            }
        }
        return result;
    }

    private boolean palindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return palindrome(s.substring(1, s.length() - 1));

    }

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return right - left - 1;
    }

}
