package leet.code.problem0220;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 * <p>
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * @author wbxing
 * @date 2020/08/18
 */
public class Problem217 {
    public static void main(String[] args) {
        Problem217 problem217 = new Problem217();
        System.out.println(problem217.containsDuplicate(new int[]{1, 2, 3, 5, 4, 4}));
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
