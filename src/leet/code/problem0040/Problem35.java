package leet.code.problem0040;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * @author wbxing
 * @date 2020/08/15
 */
public class Problem35 {

    public static void main(String[] args) {
        Problem35 problem35 = new Problem35();
        System.out.println(problem35.searchInsert(new int[]{1, 2, 3}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
