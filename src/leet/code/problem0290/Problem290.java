package leet.code.problem0290;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 *
 * @author wbxing
 * @date 2020/12/16
 */
public class Problem290 {

    public static void main(String[] args) {
        Problem290 problem290 = new Problem290();
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(problem290.wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s) {

        if (pattern == null) {
            return false;
        }

        char[] patterns = pattern.toCharArray();
        String[] words = s.split(" ");

        if (patterns.length != words.length) {
            return false;
        }

        Map<Character, String> maps = new HashMap<>(patterns.length);
        for (int i = 0; i < patterns.length; i++) {
            if (maps.get(patterns[i]) != null) {
                String tmp = maps.get(patterns[i]);
                if (tmp.equals(words[i])) {
                    continue;
                }
                return false;
            }
            if (maps.containsValue(words[i])) {
                return false;
            }
            maps.put(patterns[i], words[i]);
        }
        return true;
    }
}
