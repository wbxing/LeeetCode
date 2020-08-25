package leet.code.problem0140;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. 只出现一次的数字
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * @author wbxing
 * @date 2020/08/25
 */
public class Problem136 {
    public static void main(String[] args) {
        Problem136 problem136 = new Problem136();
        System.out.println(problem136.singleNumber1(new int[]{1, 2, 1}));
    }

    public int singleNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public int singleNumber1(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if ((set.contains(num))) {
                set.remove(num);
                continue;
            }
            set.add(num);
        }
        if (set.size() != 1) {
            return -1;
        }
        return set.iterator().next();
    }
}
