package leet.code.problem0860;

/**
 * 柠檬水找零
 *
 * @author wbxing
 * @date 2020/08/14
 */
public class Problem860 {
    public static void main(String[] args) {
        Problem860 problem860 = new Problem860();
        System.out.println(problem860.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        if (bills == null || bills.length == 0) {
            return true;
        }
        if (bills[0] > 5) {
            return false;
        }
        fiveCount++;
        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCount++;
                continue;
            }
            if (bills[i] == 10) {
                if (fiveCount < 1) {
                    return false;
                } else {
                    fiveCount--;
                    // System.out.println("fiveCount = " + fiveCount);
                    tenCount++;
                }
            }
            if (bills[i] == 20) {
                if (fiveCount == 0) {
                    return false;
                }
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount > 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }

            }
        }
        return fiveCount >= 0;
    }
}
