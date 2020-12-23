package leet.code.problem0390;

/**
 * 387. 字符串中的第一个唯一字符
 *
 * @author wbxing
 * @date 2020/12/23
 */
public class Problem387 {

    public static void main(String[] args) {
        Problem387 problem387 = new Problem387();
        System.out.println(problem387.firstUniqChar("qwertyuiopasdfghjklzxcvbnm"));
    }

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }

        int[] hash = new int['z' - 'a' + 1];
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            hash[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hash[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
