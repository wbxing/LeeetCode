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
        System.out.println(problem119.getRow(10));
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

        List<Integer> pre = getRow(rowIndex - 1);
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        for (int j = 1; j < rowIndex; j++) {
            tmp.add(pre.get(j - 1) + pre.get(j));
        }
        tmp.add(1);
        return tmp;
    }
}

