package leet.code.problem0030;

/**
 * 28. 实现 strStr()
 * <p>
 * 实现 strStr() 函数
 *
 * @author wbxing
 * @date 2020/08/14
 */
public class Problem28 {

    public static void main(String[] args) {
        Problem28 problem28 = new Problem28();
        System.out.println(problem28.strStr("hello", null));
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        }
        return haystack.indexOf(needle);
    }
}
