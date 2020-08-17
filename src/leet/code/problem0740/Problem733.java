package leet.code.problem0740;

import java.util.Arrays;

/**
 * 733. 图像渲染
 *
 * @author wbxing
 * @date 2020/08/17
 */
public class Problem733 {
    public static void main(String[] args) {
        Problem733 problem733 = new Problem733();
        int[][] ints = problem733.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1,
                1, 1);
        for (int[] a : ints) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (sr < 0 || sc < 0 || image == null) {
            return image;
        }
        int src = image[sr][sc];
        if (src != newColor) {
            image[sr][sc] = newColor;
        } else {
            return image;
        }
        if (sr > 0 && image[sr - 1][sc] == src) {
            floodFill(image, sr - 1, sc, newColor);
        }
        if (sc > 0 && image[sr][sc - 1] == src) {
            floodFill(image, sr, sc - 1, newColor);
        }
        if (sr < image.length - 1 && image[sr + 1][sc] == src) {
            floodFill(image, sr + 1, sc, newColor);
        }
        if (sc < image[0].length - 1 && image[sr][sc + 1] == src) {
            floodFill(image, sr, sc + 1, newColor);
        }
        return image;
    }
}
