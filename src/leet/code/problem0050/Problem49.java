package leet.code.problem0050;

import java.util.*;

/**
 * 49. 字母异位词分组
 *
 * @author wbxing
 * @date 2020/12/14
 */
public class Problem49 {

    public static void main(String[] args) {
        Problem49 problem49 = new Problem49();
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(problem49.groupAnagrams(strings));
    }

    public List<List<String>> groupAnagrams(String[] strings) {

        if (strings == null || strings.length == 0) {
            return null;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
