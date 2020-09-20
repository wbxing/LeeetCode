package leet.code.problem0080;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * <p>
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * @author wbxing
 * @date 2020/09/20
 */
public class Problem75 {

    public static void main(String[] args) {

        Problem75 problem75 = new Problem75();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> subsets = problem75.subsets(nums);
        System.out.println(subsets);

    }

    public List<List<Integer>> subsets(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            list.clear();
            for (int j = 0; j < nums.length; j++) {

                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            result.add(new ArrayList<>(list));
        }

        return result;

    }
}
