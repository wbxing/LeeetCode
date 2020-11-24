package leet.code.problem0030;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 *
 * @author wbxing
 * @date 2020/11/23
 */
public class Problem22 {

    public static void main(String[] args) {
        Problem22 problem22 = new Problem22();
        System.out.println(problem22.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {

        if (n == 0) {
            return new ArrayList<>();
        }

        List<List<String>> result = new ArrayList<>();
        List<String> list0 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list0.add("");
        list1.add("()");
        result.add(list0);
        result.add(list1);

        for (int i = 2; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        temp.add("(" + s1 + ")" + s2);
                    }
                }
            }
            result.add(temp);
        }
        return result.get(n);
    }
}
