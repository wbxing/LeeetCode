package leet.code.problem0040;

import java.util.Arrays;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 *
 * @author wbxing
 * @date 2020/12/01
 */
public class Problem34 {

    public static void main(String[] args) {
        Problem34 problem34 = new Problem34();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(problem34.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int length = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                length = mid;
            } else {
                left = mid + 1;
            }
        }
        return length;
    }
}
