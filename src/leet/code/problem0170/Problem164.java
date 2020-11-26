package leet.code.problem0170;

import java.util.Arrays;

/**
 * 164. 最大间距
 *
 * @author wbxing
 * @date 2020/11/26
 */
public class Problem164 {
    public static void main(String[] args) {
        Problem164 problem164 = new Problem164();
        int[] nums = new int[]{3,6,9,1};
        System.out.println(problem164.maximumGap(nums));
    }

    public int maximumGap(int[] nums) {
        int threshold = 2;
        if (nums == null || nums.length < threshold) {
            return 0;
        }

        long flag = 1;
        int[] buf = new int[nums.length];
        int max = Arrays.stream(nums).max().getAsInt();
        while (max >= flag) {
            int[] count = new int[10];
            for (int num : nums) {
                int digit = (num / (int) flag) % 10;
                count[digit]++;
            }
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) flag) % 10;
                buf[count[digit] - 1] = nums[i];
                count[digit]--;
            }
            System.arraycopy(buf, 0, nums, 0, nums.length);
            flag *= 10;
        }

        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, nums[i] - nums[i - 1]);
        }
        return result;
    }

}
