package leet.code.interview.offer.problem050;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 *
 * @author wbxing
 * @date 2020/09/21
 */
public class Problem42 {

    public static void main(String[] args) {
        Problem42 problem42 = new Problem42();
        System.out.println(problem42.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
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
