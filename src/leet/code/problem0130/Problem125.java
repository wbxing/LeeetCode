package leet.code.problem0130;

/**
 * 125. 验证回文串
 * <p>
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem125 {
    public static void main(String[] args) {
        Problem125 problem125 = new Problem125();
        System.out.println(problem125.isPalindrome("ab2a"));
    }
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.trim().toLowerCase();
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
            if ((s.charAt(head) < 'a' || s.charAt(head) > 'z') && !Character.isDigit(s.charAt(head))) {
                head ++;
                continue;
            }
            if ((s.charAt(tail) < 'a' || s.charAt(tail) > 'z') && !Character.isDigit(s.charAt(tail))) {
                tail --;
                continue;
            }

            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
