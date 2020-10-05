package leet.code.problem0300;

/**
 * 300. 最长上升子序列
 *
 * @author wbxing
 * @date 2020/10/05
 */
public class Problem300 {
    public static void main(String[] args) {
        Problem300 problem300 = new Problem300();
        int[] ints = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(problem300.lengthOfLIS(ints));
    }

    public int lengthOfLIS(int[] nums) {

        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] length = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, length[j]);
                }
            }
            length[i] = max + 1;
            result = Math.max(result, length[i]);
        }
        return result;
    }
}
