package leet.code.problem1520;

/**
 * 1512. 好数对的数目
 *
 * @author wbxing
 * @date 2020/10/09
 */
public class Problem1512 {
    public static void main(String[] args) {
        Problem1512 problem1512 = new Problem1512();
        System.out.println(problem1512.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
