package leet.code.problem0070;

/**
 * 69. x 的平方根
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * @author wbxing
 * @date 2020/08/20
 */
public class Problem69 {
    public static void main(String[] args) {
        Problem69 problem69 = new Problem69();
        System.out.println(problem69.mySqrt(2147483647));
    }

    public int mySqrt(int x) {
        // return  (int)Math.floor(Math.sqrt(x));

        if (x < 0) {
            return -1;
        }
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 0;
        int high = x;
        int res = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            // 溢出
            long tmp = (long) mid * mid;
            if (tmp <= x) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

}
