package leet.code.problem0200;

/**
 * 191. 位 1 的个数
 * <p>
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * @author wbxing
 * @date 2020/09/01
 */
public class Problem191 {

    public static void main(String[] args) {
        Problem191 problem191 = new Problem191();
        System.out.println(problem191.hammingWeight(252436542));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                result++;
            }
            n >>= 1;
        }
        return result;
    }
}
