package leet.code.problem0500;

/**
 * 493. 翻转对
 *
 * @author wbxing
 * @date 2020/11/28
 */
public class Problem493 {
    public static void main(String[] args) {

        Problem493 problem493 = new Problem493();
        int[] nums1 = new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        int[] nums2 = new int[]{2, 4, 3, 5, 1};
        System.out.println(problem493.reversePairs(nums1));

    }

    public int reversePairs(int[] nums) {
        int threshold = 2;
        if (nums.length < threshold) {
            return 0;
        }
        return sort(nums, 0, nums.length - 1);

    }

    public int sort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        int leftRes = sort(nums, left, mid);
        int rightRes = sort(nums, mid + 1, right);

        return leftRes + rightRes + merge(nums, left, mid, right);
    }

    public int merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int res = 0;
        int flag = 0;
        while (i <= mid && j <= right) {
            long base = nums[i];
            long tmp = nums[j];
            if (base > 2 * tmp) {
                res += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        i = left;
        j = mid + 1;
        while (i <= mid && j <= right) {

            if (nums[i] < nums[j]) {
                temp[flag++] = nums[i++];
            } else {
                temp[flag++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[flag++] = nums[i++];
        }
        while (j <= right) {
            temp[flag++] = nums[j++];
        }

        if (temp.length >= 0) {
            System.arraycopy(temp, 0, nums, left, temp.length);
        }
        return res;
    }
}
