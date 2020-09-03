package leet.code.problem0020;

/**
 * 11. 盛最多水的容器
 *
 * @author wbxing
 * @date 2020/09/03
 */
public class Problem11 {

    public static void main(String[] args) {
        Problem11 problem11 = new Problem11();
        System.out.println(problem11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea1(int[] height) {
        int maxArea = 0;
        int count = height.length;
        for (int i = 0; i < count; i++) {
            // int currentHeight = height[i];
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    continue;
                }
                int currentHeight = Math.min(height[i], height[j]);
                int currentArea = currentHeight * Math.abs(j - i);
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // System.out.println(currentArea);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
