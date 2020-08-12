package leet.code.problem0030;

/**
 * 删除排序数组中的重复项
 * <p>
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * @author wbxing
 * @date 2020/08/12
 */
public class Problem26 {

    public static void main(String[] args) {
        Problem26 problem26 = new Problem26();
        System.out.println(problem26.removeDuplicates(new int[]{1, 1,1, 2, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                nums[++count] = nums[i];
            }
        }
        return count + 1;
    }
}
