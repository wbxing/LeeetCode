package leet.code.problem0120;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * <p>
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * @author wbxing
 * @date 2020/08/27
 */
public class Problem118 {
    public static void main(String[] args) {
        Problem118 problem118 = new Problem118();
        System.out.println(problem118.generate(10));
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        if (numRows == 1) {
            return res;
        }
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        res.add(second);
        if (numRows == 2) {
            return res;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(res.get(res.size() - 1).get(j - 1) + res.get(res.size() - 1).get(j));
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res;
    }
}
