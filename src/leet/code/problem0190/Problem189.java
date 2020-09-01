package leet.code.problem0190;

import java.util.Arrays;

/**
 * 189. 旋转数组
 * <p>
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * @author wbxing
 * @date 2020/09/01
 */
public class Problem189 {
    public static void main(String[] args) {
        Problem189 problem189 = new Problem189();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        problem189.rotate(nums, 0);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        if (nums.length == 0) {
            return;
        }
        if (k > nums.length) {
            k %= nums.length;
        }
        reverseArray(nums, nums.length - k, nums.length);
        reverseArray(nums, 0, nums.length - k);
        reverseArray(nums, 0, nums.length);
    }

    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[--end];
            nums[end] = tmp;
        }
    }
}
