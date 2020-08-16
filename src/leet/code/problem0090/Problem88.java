package leet.code.problem0090;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * @author wbxing
 * @date 2020/08/16
 */
public class Problem88 {

    public static void main(String[] args) {
        Problem88 problem88 = new Problem88();
        int[] nums1 = new int[]{4, 5, 8, 9, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{5, 6, 10};
        int n = 3;
        problem88.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] < nums2[p2]) {
                nums1[p--] = nums2[p2--];
            } else if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
                nums1[p--] = nums1[p1--];
            }
        }
        if (p2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        }
    }

}
