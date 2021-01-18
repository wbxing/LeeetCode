package leet.code.problem0520;

/**
 * 520. 检测大写字母
 *
 * @author wbxing
 * @date 2021/01/18
 */
public class Problem520 {

    public static void main(String[] args) {
        Problem520 problem520 = new Problem520();
        String word = "GooGle";
        System.out.println(problem520.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        char first = word.charAt(0);
        // 首字母小写，后续全部小写
        if (first >= 'a' && first <= 'z') {
            return isUniformity(first, word.substring(1));
        }
        // 首字母大写，后续全部和第二个字母一致
        if (first >= 'A' && first <= 'Z') {
            char second = word.charAt(1);
            return isUniformity(second, word.substring(2));
        }
        return true;
    }

    private boolean isUniformity(char flag, String str) {

        if (flag >= 'A' && flag <= 'Z') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    return false;
                }
            }
        }
        if (flag >= 'a' && flag <= 'z') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    return false;
                }
            }
        }
        return true;
    }
}
