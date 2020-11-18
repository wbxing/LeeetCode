package leet.code.problem0140;

/**
 * 134. 加油站
 *
 * @author wbxing
 * @date 2020/11/18
 */
public class Problem134 {

    public static void main(String[] args) {
        Problem134 problem134 = new Problem134();
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        System.out.println(problem134.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int min = gas[0] - cost[0];
        int pre = min;
        for (int i = 1; i < gas.length; i++) {
            int current = gas[i] - cost[i];
            if (min > pre + current) {
                min = pre + current;
                index = i;
            }
            pre += current;
        }
        return (pre < 0) ? -1 : ((index + 1) % gas.length);
    }
}
