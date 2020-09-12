package leet.code.problem5500;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 5497. 查找大小为 M 的最新分组
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem5497 {
    public static void main(String[] args) {
        Problem5497 problem03 = new Problem5497();
        System.out.println(problem03.findLatestStep(new int[]{2, 1}, 2));
    }

    public int findLatestStep1(int[] arr, int m) {
        if (m == arr.length) {
            return m;
        }
        int[] res = new int[arr.length];
        Arrays.fill(res, 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr[i] - 1] = 0;
            String replace = Arrays.toString(res).replace(" ", "")
                    .replace(",", "");
            String substring = replace.substring(1, replace.length() - 1);
            String[] split = substring.split("0+");
            for (String s : split) {
                if (s.length() == m) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int findLatestStep(int[] arr, int m) {
        if (arr.length == m) {
            return m;
        }
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(arr.length + 1);
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int index = arr[i];
            Integer a = set.lower(index);
            Integer b = set.higher(index);
            if (index - a - 1 == m || b - index - 1 == m) {
                return i;
            }
            set.add(index);
        }
        return -1;
    }

}
