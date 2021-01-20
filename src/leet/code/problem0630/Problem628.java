package leet.code.problem0630;

import java.util.Arrays;

/**
 * 628. 三个数的最大乘积
 *
 * @author wbxing
 * @date 2021/01/20
 */
public class Problem628 {

    public static void main(String[] args) {
        Problem628 problem628 = new Problem628();
        int[] nums = new int[]{-100, -98, -1, 5, 1, 2, 3, 4};
        System.out.println(problem628.maximumProduct(nums));
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3], nums[length - 1] * nums[0] * nums[1]);
    }
}
