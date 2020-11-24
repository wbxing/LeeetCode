package leet.code.problem0020;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 *
 * @author wbxing
 * @date 2020/11/23
 */
public class Problem17 {

    public static void main(String[] args) {
        Problem17 problem17 = new Problem17();
        System.out.println(problem17.letterCombinations("12"));
    }

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        String[] table = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int len = 1;

        for (int i = 0; i < digits.length(); i++) {
            int c = digits.charAt(i) - '0';
            len *= table[c].length();
        }
        for (int i = 0; i < len; i++) {
            int last = i;
            StringBuilder sb = new StringBuilder();
            for (int j = digits.length() - 1; j >= 0; j--) {
                int c = digits.charAt(j) - '0';
                int pos = last % table[c].length();
                sb.append(table[c].charAt(pos));
                last /= table[c].length();
            }
            result.add(sb.reverse().toString());
        }

        return result;
    }
}
