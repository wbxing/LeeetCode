package leet.code.problem0030;

/**
 * 移除元素
 * <p>
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * @author wbxing
 * @date 2020/08/12
 */
public class Problem27 {

    public static void main(String[] args) {
        Problem27 problem27 = new Problem27();
        System.out.println(problem27.removeElement(new int[]{1}, 1));
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                while (nums[j] == val && j > i) {
                    j--;
                }
                if (j <= i) {
                    break;
                }
                nums[i] = nums[j--];
            }
            i++;
        }
        return i;
    }
}
