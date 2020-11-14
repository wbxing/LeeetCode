package leet.code.interview.offer.problem050;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author wbxing
 * @date 2020/11/14
 */
public class Problem58_2 {

    public static void main(String[] args) {
        Problem58_2 p = new Problem58_2();
        System.out.println(p.reverseLeftWords("abcdefg", 2));
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

}
