package leet.code.problem0480;

import java.util.Arrays;

/**
 * 480. 滑动窗口中位数
 *
 * @author wbxing
 * @date 2021/02/03
 */
public class Problem480 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(new Problem480().medianSlidingWindow(nums, k)));
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new double[]{nums[0]};
        }
        double[] result = new double[nums.length - k + 1];
        int cnt = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int[] current = new int[k];
            if (k >= 0) {
                System.arraycopy(nums, i, current, 0, k);
            }
            Arrays.sort(current);
            if (k % 2 != 0) {
                result[cnt++] = current[k / 2];
            } else {
                result[cnt++] = (current[k / 2 - 1]) / 2.0 + current[k / 2] / 2.0;
            }
        }
        return result;
    }
}
