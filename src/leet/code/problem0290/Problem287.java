package leet.code.problem0290;

/**
 * 287. 寻找重复数
 * <p>
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * <p>
 * 假设只有一个重复的整数，找出这个重复的数。
 *
 * @author wbxing
 * @date 2020/08/18
 */
public class Problem287 {

    public static void main(String[] args) {
        Problem287 problem287 = new Problem287();
        System.out.println(problem287.findDuplicate(new int[]{1, 2, 3, 5, 4, 4}));
    }

    public int findDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] counts = new int[nums.length];
        for (int num : nums) {
            if (counts[num] == 1) {
                return num;
            }
            counts[num]++;
        }
        return 0;
    }
}
