package leet.code.lcp.problem0010;

import java.util.Arrays;

/**
 * 剧情触发时间
 * <p>
 * 在战略游戏中，玩家往往需要发展自己的势力来触发各种新的剧情。 一个势力的主要属性有三种，分别是文明等级（C），资源储备（R）以及人口数量（H）。 在游戏开始时（第 0 天），三种属性的值均为 0。
 * <p>
 * 随着游戏进程的进行，每一天玩家的三种属性都会对应增加，我们用一个二维数组 increase 来表示每天的增加情况。 这个二维数组的每个元素是一个长度为 3 的一维数组，例如 [[1,2,1],[3,4,2]]
 * 表示第一天三种属性分别增加 1,2,1 而第二天分别增加 3,4,2。
 * <p>
 * 所有剧情的触发条件也用一个二维数组 requirements 表示。 这个二维数组的每个元素是一个长度为 3 的一维数组， 对于某个剧情的触发条件 c[i], r[i], h[i]， 如果当前 C >= c[i] 且 R >=
 * r[i] 且 H >= h[i] ，则剧情会被触发。
 * <p>
 * 根据所给信息，请计算每个剧情的触发时间，并以一个数组返回。如 果某个剧情不会被触发，则该剧情对应的触发时间为 -1 。
 * <p>
 */
public class Problem08 {

    public static void main(String[] args) {
        Problem08 problem08 = new Problem08();
        int[][] increase = new int[][]{{2, 8, 4}, {2, 5, 0}, {10, 9, 8}};
        int[][] requirements = new int[][]{{2, 11, 3}, {15, 10, 7}, {9, 17, 12}, {8, 1, 14}};
        System.out.println(Arrays.toString(problem08.getTriggerTime(increase, requirements)));
    }

    public int[] getTriggerTime(int[][] increase, int[][] requirements) {

        int[] result = new int[requirements.length];

        // 累加 increase
        for (int i = 1; i < increase.length; i++) {
            for (int j = 0; j < 3; j++) {
                increase[i][j] += increase[i - 1][j];
            }
        }
        for (int i = 0; i < requirements.length; i++) {
            // 特殊值
            if (requirements[i][0] == 0 && requirements[i][1] == 0 && requirements[i][2] == 0) {
                result[i] = 0;
            } else {
                // 查找符合条件的 increase
                // 二分查找
                int left = 0;
                int right = increase.length - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    // 任意一个小于目标值，左指针右移
                    if (increase[mid][0] < requirements[i][0]
                            || increase[mid][1] < requirements[i][1]
                            || increase[mid][2] < requirements[i][2]) {
                        left = mid + 1;
                    } else {
                        // 右指针左移
                        right = mid - 1;
                    }
                }
                // 判断查找结果，没找到直接返回 -1
                if (left < increase.length) {
                    // 判断是不是全部满足
                    if (increase[left][0] >= requirements[i][0]
                            && increase[left][1] >= requirements[i][1]
                            && increase[left][2] >= requirements[i][2]) {
                        result[i] = left + 1;
                    } else {
                        result[i] = -1;
                    }
                } else {
                    result[i] = -1;
                }
            }
        }
        return result;
    }
}
