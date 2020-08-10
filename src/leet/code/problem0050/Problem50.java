package leet.code.problem0050;

import java.text.DecimalFormat;

/**
 * Pow(x, n)
 * <p>
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 *
 * @author wbxing
 * @date 2020/08/08
 */
public class Problem50 {

    public static void main(String[] args) {
        Problem50 problem50 = new Problem50();
        System.out.println(problem50.myPow(5.00000, -2));
    }

    public double myPow(double x, int n) {
        boolean flag = false;
        long index = n;
        if (index < 0) {
            flag = true;
            index = -index;
        }
        double result = myMul(x, index);
        if (flag) {
            result = 1.0 / result;
        }
        DecimalFormat format = new DecimalFormat("0.00000");
        return Double.parseDouble(format.format(result));
    }

    public double myMul(double base, long index) {
        if (index == 0) {
            return 1.0;
        }
        double temp = myMul(base, index / 2);
        return index % 2 == 0 ? temp * temp : base * temp * temp;
    }

}
