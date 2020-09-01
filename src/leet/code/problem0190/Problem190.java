package leet.code.problem0190;

/**
 * 190. 颠倒二进制位
 * <p>
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 * @author wbxing
 * @date 2020/09/01
 */
public class Problem190 {

    public static void main(String[] args) {
        Problem190 problem190 = new Problem190();
        System.out.println(problem190.reverseBits(43261596));
    }
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            n >>= 1;
        }
        return result;
    }
}
