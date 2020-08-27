package leet.code.problem0120;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * <p>
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * @author wbxing
 * @date 2020/08/27
 */
public class Problem119 {
    public static void main(String[] args) {
        Problem119 problem119 = new Problem119();
        System.out.println(problem119.getRow(2));
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> first = new ArrayList<>();
        first.add(1);
        if (rowIndex == 0) {
            return first;
        }
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        if (rowIndex == 1) {
            return second;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(first);
        res.add(second);
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(res.get(res.size() - 1).get(j - 1) + res.get(res.size() - 1).get(j));
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res.get(res.size() - 1);
    }
}

