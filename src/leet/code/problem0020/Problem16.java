package leet.code.problem0020;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 *
 * @author wbxing
 * @date 2020/11/26
 */
public class Problem16 {

    public static void main(String[] args) {
        Problem16 problem16 = new Problem16();
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.println(problem16.threeSumClosest(nums, target));
    }

    public int threeSumClosest(int[] nums, int target) {

        int threshold = 3;
        if (nums == null || nums.length < threshold) {
            return -1;
        }

        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - threshold + 1; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closest - target)) {
                    closest = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }
        return closest;
    }
}
