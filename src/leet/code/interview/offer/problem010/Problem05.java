package leet.code.interview.offer.problem010;

/**
 * 剑指 Offer 05. 替换空格
 * @author wbxing
 * @date 2020/10/05
 */
public class Problem05 {

    public static void main(String[] args) {
        Problem05 problem05 = new Problem05();
        System.out.println(problem05.replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++) {
            if (" ".equals(String.valueOf(s.charAt(i)))) {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
