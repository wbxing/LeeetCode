package leet.code.problem1010;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. 查找常用字符
 *
 * @author wbxing
 * @date 2020/10/14
 */
public class Problem1002 {
    public static void main(String[] args) {
        Problem1002 problem1002 = new Problem1002();
        String[] strings = new String[]{};
        System.out.println(problem1002.commonChars(strings));
    }

    public List<String> commonChars(String[] A) {
        if (A == null || A.length == 0) {
            return new ArrayList<>();
        }

        StringBuilder sb = new StringBuilder(A[0]);
        List<String> list = new ArrayList<>();
        for (int i = 1; i < A.length; i++) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < A[i].length(); j++) {
                if (sb.toString().contains(String.valueOf(A[i].charAt(j)))) {
                    tmp.append(A[i].charAt(j));
                    sb.deleteCharAt(sb.indexOf(String.valueOf(A[i].charAt(j))));
                }
            }
            sb.delete(0, sb.length()).append(tmp);
        }
        for (char c : sb.toString().toCharArray()) {
            list.add(String.valueOf(c));
        }
        return list;
    }
}
