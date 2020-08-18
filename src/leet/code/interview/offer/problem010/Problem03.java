package leet.code.interview.offer.problem010;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * <p>
 * 找出数组中重复的数字。
 *
 * @author wbxing
 * @date 2020/08/18
 */
public class Problem03 {
    public static void main(String[] args) {
        Problem03 problem03 = new Problem03();
        System.out.println(problem03.findRepeatNumber(new int[]{1, 2, 3, 5, 4, 4}));
    }

    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] counts = new int[nums.length];
        for (int num : nums) {
            if (counts[num] == 1) {
                return num;
            }
            counts[num]++;
        }
        return -1;
    }
}
