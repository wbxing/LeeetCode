package leet.code.problem0090;

/**
 * 84. 柱状图中最大的矩形
 *
 * @author wbxing
 * @date 2020/10/05
 */
public class Problem84 {
    public static void main(String[] args) {
        Problem84 problem84 = new Problem84();
        int[] h = new int[]{2, 1, 5, 6, 2, 3};
        System.out.println(problem84.largestRectangleArea(h));
    }

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentH = heights[i];
            int currentW = 1;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] >= currentH) {
                    currentW++;
                } else {
                    break;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] >= currentH) {
                    currentW++;
                } else {
                    break;
                }
            }

            if (currentH * currentW > maxArea) {
                maxArea = currentH * currentW;
            }
        }
        return maxArea;
    }
}
