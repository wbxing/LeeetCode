package leet.code.problem0460;

import java.util.Arrays;

/**
 * 452. 用最少数量的箭引爆气球
 *
 * @author wbxing
 * @date 2020/11/23
 */
public class Problem452 {

    public static void main(String[] args) {
        Problem452 problem452 = new Problem452();
        int[][] points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(problem452.findMinArrowShots(points));
    }

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (p1, p2) -> p1[1] < p2[1] ? -1 : 1);
        int res = 1;
        int pre = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > pre) {
                res++;
                pre = points[i][1];
            }
        }
        return res;
    }
}
