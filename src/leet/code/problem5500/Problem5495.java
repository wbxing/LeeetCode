package leet.code.problem5500;

import java.util.ArrayList;
import java.util.List;

/**
 * 5495. 圆形赛道上经过次数最多的扇区
 *
 * @author wbxing
 * @date 2020/08/23
 */
public class Problem5495 {
    public static void main(String[] args) {
        Problem5495 problem01 = new Problem5495();
        System.out.println(problem01.mostVisited(2, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2}));
    }

    public List<Integer> mostVisited(int n, int[] rounds) {

        int[] counts = new int[n + 1];
        // counts[rounds[0]] = 1;
        for (int i = 1; i < rounds.length; i++) {
            int current = rounds[i - 1];
            int next = rounds[i];
            while (current != next) {
                counts[current]++;
                current++;
                if (current > n) {
                    current = 1;
                }
            }
        }
        counts[rounds[rounds.length - 1]]++;
        // System.out.println(Arrays.toString(counts));
        int max = counts[0];
        for (int i : counts) {
            if (max < i) {
                max = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == max) {
                res.add(i);
            }

        }
        return res;
    }
}
