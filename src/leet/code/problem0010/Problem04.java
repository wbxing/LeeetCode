package leet.code.problem0010;

/**
 * 4. 寻找两个正序数组的中位数
 *
 * @author wbxing
 * @date 2020/09/03
 */
public class Problem04 {
    public static void main(String[] args) {
        Problem04 problem04 = new Problem04();
        int[] nums1 = new int[]{1, 2, 5, 9};
        int[] nums2 = new int[]{3, 4, 6, 7};
        System.out.println(problem04.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] array = new int[nums1.length + nums2.length];
        int length = nums1.length + nums2.length;
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                array[index++] = nums1[i++];
            } else {
                array[index++] = nums2[j++];
            }
            if (index > length / 2) {
                return res(length, array);
            }
        }
        while (i < nums1.length) {
            array[index++] = nums1[i++];
            if (index > length / 2) {
                return res(length, array);
            }
        }
        while (j < nums2.length) {
            array[index++] = nums2[j++];
            if (index > length / 2) {
                return res(length, array);
            }
        }
        return res(length, array);
    }
    private double res(int length, int[] array ) {
        return (length % 2 == 0) ? (array[length / 2 - 1] + array[length / 2]) / 2.0 :
                array[length / 2];
    }
}
