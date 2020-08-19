package leet.code.problem5190;

/**
 * 5185. 存在连续三个奇数的数组
 * <p>
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 *
 * @author wbxing
 * @date 2020/08/19
 */
public class Problem5185 {

    public static void main(String[] args) {
        Problem5185 problem5185 = new Problem5185();
        System.out.println(problem5185.threeConsecutiveOdds(new int[]{1, 2, 3, 4, 5}));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 0) {
                continue;
            }
            if ((arr[i + 1] & 1) == 0) {
                continue;
            }
            if ((arr[i + 2] & 1) == 1) {
                return true;
            }
        }
        return false;
    }
}
