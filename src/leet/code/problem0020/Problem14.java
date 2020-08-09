package leet.code.problem0020;

import java.util.Stack;

/**
 * 最长公共前缀
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * @author wbxing
 * @date 2020/08/09
 */
public class Problem14 {

    public static void main(String[] args) {
        Problem14 problem14 = new Problem14();
        System.out.println(problem14.longestCommonPrefix(new String[]{"flower", "alow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        Stack<String> prefix = new Stack<>();
        prefix.push(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            if ("".equals(prefix.peek()) || prefix.peek() == null || prefix.isEmpty()) {
                break;
            }
            String str1 = prefix.pop();
            String str2 = strs[i];
            int minLength = Math.min(str1.length(), str2.length());
            int index = 0;
            while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            prefix.push(str1.substring(0, index));
        }

        if ("".equals(prefix.peek()) || prefix.peek() == null || prefix.isEmpty()) {
            return "";
        }
        return prefix.pop();
    }
}
