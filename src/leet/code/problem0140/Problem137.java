package leet.code.problem0140;

import java.util.HashMap;
import java.util.Map;

/**
 * 137. 只出现一次的数字 II
 * <p>
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 *
 * @author wbxing
 * @date 2020/08/25
 */
public class Problem137 {
    public static void main(String[] args) {
        Problem137 problem137 = new Problem137();
        System.out.println(problem137.singleNumber(new int[]{1,2,1,1}));
    }
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) == 1) {
                map.put(num, 2);
                continue;
            }
            if (map.containsKey(num) && map.get(num) == 2) {
                map.remove(num);
                continue;
            }
            map.put(num, 1);
        }
        if (map.size() != 1) {
            return -1;
        }
        return map.keySet().iterator().next();
    }
}
