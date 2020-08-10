package leet.code.problem0700;

import java.util.ArrayList;
import java.util.List;

/**
 * 计数二进制子串
 * <p>
 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 *
 * @author wbxing
 * @date 2020/08/10
 */
public class Problem696 {

    public static void main(String[] args) {
        Problem696 problem696 = new Problem696();
        System.out.println(problem696.countBinarySubstrings("1100"));
    }

    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            char first = s.charAt(index);
            int total = 0;
            while (index < s.length() && s.charAt(index) == first) {
                index++;
                total++;
            }
            counts.add(total);
        }

        int count = 0;
        for (int i = 0; i < counts.size() - 1; i++) {
            count += Math.min(counts.get(i), counts.get(i + 1));
        }
        return count;
    }
}
