package leet.code.problem0060;

/**
 * 最大子序和
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * @author wbxing
 */
public class Problem53 {

    public static void main(String[] args) {
        Problem53 problem53 = new Problem53();
        System.out.println(problem53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i - 1] + nums[i];
            if (nums[i] < temp) {
                nums[i] = temp;
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
