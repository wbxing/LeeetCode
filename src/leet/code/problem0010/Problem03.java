package leet.code.problem0010;

/**
 * 无重复字符的最长子串
 * <p>
 * 无重复最长子串 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Problem03 {
    public static void main(String[] args) {
        Problem03 problem3 = new Problem03();
        System.out.println(problem3.lengthOfLongestSubstring(" "));
    }

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() < 1) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int[] length = new int[chars.length];
        length[0] = 1;
        int max = length[0];
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            String subString = sb.toString();
            if (subString.contains(String.valueOf(chars[i]))) {
                sb.delete(0, sb.indexOf(String.valueOf(chars[i])) + 1);
            }
            sb.append(chars[i]);
            length[i] = sb.length();
            if (max < length[i]) {
                max = length[i];
            }
        }

        return max;
    }
}
