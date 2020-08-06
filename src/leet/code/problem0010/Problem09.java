package leet.code.problem0010;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Problem09 {

    public static void main(String[] args) {
        Problem09 problem9 = new Problem09();
        System.out.println(problem9.isPalindrome(0));
    }

    public boolean isPalindrome(int x) {
        // 负数
        if (x < 0) {
            return false;
        }
        // 一位数
        if (x < 10) {
            return true;
        }
        // 0 结尾
        if (x % 10 == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String src = sb.toString();
        String dest = sb.reverse().toString();
        return src.equals(dest);
    }
}
