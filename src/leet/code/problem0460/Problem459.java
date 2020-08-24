package leet.code.problem0460;

/**
 * 459. 重复的子字符串
 * <p>
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * @author wbxing
 * @date 2020/08/24
 */
public class Problem459 {
    public static void main(String[] args) {
        Problem459 problem459 = new Problem459();
        System.out.println(problem459.repeatedSubstringPattern("abab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }

        int length = s.length();
        for (int i = 1; i <= length / 2; i++) {
            if (length % i != 0) {
                continue;
            }
            System.out.println(i);
            boolean flag = true;
            String prefix = s.substring(0, i);
            System.out.println("prefix = " + prefix);
            for (int j = i; j <= length - i; j += i) {
                String substring = s.substring(j, j + i);
                System.out.println("substring = " + substring);
                if (!prefix.equals(substring)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
