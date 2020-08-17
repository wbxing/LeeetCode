package leet.code.problem0060;

/**
 * 58. 最后一个单词的长度
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 * <p>
 * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * @author wbxing
 * @date 2020/08/17
 */
public class Problem58 {
    public static void main(String[] args) {
        Problem58 problem58 = new Problem58();
        System.out.println(problem58.lengthOfLastWord("hello world "));
    }

    public int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }

            if (s.charAt(i) == ' ' && length != 0) {
                break;
            }
        }
        return length;

    }

}
