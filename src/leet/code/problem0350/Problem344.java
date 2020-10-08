package leet.code.problem0350;

/**
 * 344. 反转字符串
 * <p>
 * 使用 O(1) 的额外空间解决这一问题
 *
 * @author wbxing
 * @date 2020/10/08
 */
public class Problem344 {
    public static void main(String[] args) {

        char[] s = new char[]{'h'};
        Problem344 problem344 = new Problem344();
        problem344.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
