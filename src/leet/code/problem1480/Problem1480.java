package leet.code.problem1480;

import java.util.Arrays;

/**
 * 1480. 一维数组的动态和
 *
 * @author wbxing
 * @date 2020/10/08
 */
public class Problem1480 {
    public static void main(String[] args) {
        int[] nu = new int[]{1,2,3,4};
        Problem1480 problem1480 = new Problem1480();
        System.out.println(Arrays.toString(problem1480.runningSum(nu)));
    }

    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        if (nums.length == 1) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
