package leet.code.problem1130;

import java.util.*;

/**
 * 数组的相对排序
 *
 * @author wbxing
 * @date 2020/11/14
 */
public class Problem1122 {

    public static void main(String[] args) {
        Problem1122 problem1122 = new Problem1122();
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(problem1122.relativeSortArray(arr1, arr2)));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            list.add(num);
        }
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        list.sort((x, y) -> {
            if (map.containsKey(x) || map.containsKey(y)) {
                return map.getOrDefault(x, 1001) - map.getOrDefault(y, 1001);
            }
            return x - y;
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }
        return arr1;
    }
}
