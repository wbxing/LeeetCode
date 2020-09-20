package leet.code.problem0140;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 135. 分发糖果
 *
 * @author wbxing
 * @date 2020/09/19
 */
public class Problem135 {
    public static void main(String[] args) {
        Problem135 problem135 = new Problem135();
        int[] stu = new int[]{2, 2};
        System.out.println(problem135.candy(stu));
    }

    public int candy(int[] ratings) {

        int len = ratings.length;

        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }

        List<Integer> va = new ArrayList<>();
        int[] can = new int[len];

        if (ratings[0] <= ratings[1]) {
            va.add(0);
        }
        if (ratings[len - 1] <= ratings[len - 2]) {
            va.add(len - 1);
        }
        for (int i = 1; i < len - 1; i++) {
            if (ratings[i] <= ratings[i - 1] && ratings[i] <= ratings[i + 1]) {
                va.add(i);
            }
        }

        System.out.println(va);

        for (int cur : va) {
//            int cur = va.get(i);
            can[cur] = 1;
            int i = cur;
            int j = cur;
            while (i > 0) {
                if (ratings[i - 1] > ratings[i]) {
                    can[i - 1] = Math.max(can[i - 1], can[i] + 1);
                }
//                if (ratings[i - 1] == ratings[i]) {
//                    can[i - 1] = Math.max(can[i - 1], can[i]);
//                    can[i] = can[i - 1];
//                }
                i--;
            }

            while (j < len - 1) {
                if (ratings[j + 1] > ratings[j]) {
                    can[j + 1] = Math.max(can[j + 1], can[j] + 1);
                }
//                if (ratings[j + 1] == ratings[j]) {
//                    can[j + 1] = Math.max(can[j + 1], can[j]);
//                    can[j] = can[j + 1];
//                }
                j++;
            }
        }

        System.out.println(Arrays.toString(can));
        int sum = 0;
        for (int i : can) {
            sum += i;
        }

        return sum;
    }
}
