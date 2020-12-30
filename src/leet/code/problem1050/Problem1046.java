package leet.code.problem1050;

import java.util.PriorityQueue;

/**
 * 1046. 最后一块石头的重量
 *
 * @author wbxing
 * @date 2020/12/30
 */
public class Problem1046 {

    public static void main(String[] args) {
        Problem1046 problem1046 = new Problem1046();
        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(problem1046.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return 1;
        }
        if (stones.length == 2) {
            return Math.abs(stones[1] - stones[0]);
        }

        PriorityQueue<Integer> stoneQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            stoneQueue.offer(stone);
        }

        while (stoneQueue.size() > 1) {
            int a = stoneQueue.poll();
            assert stoneQueue.size() > 0;
            int b = stoneQueue.poll();
            if (a > b) {
                stoneQueue.offer(a - b);
            }
        }
        return stoneQueue.isEmpty() ? 0 : stoneQueue.poll();
    }
}
