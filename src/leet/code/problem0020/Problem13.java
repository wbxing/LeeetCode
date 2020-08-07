package leet.code.problem0020;

/**
 * 罗马数字转整数
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
 * <p>
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4
 *
 * @author wbxing
 */
public class Problem13 {

    public static void main(String[] args) {
        Problem13 problem13 = new Problem13();
        System.out.println(problem13.romanToInt("CIV"));

    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int current = value(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            // 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例
            int next = value(chars[i]);
            if (next > current) {
                result -= current;
            } else {
                result += current;
            }
            current = next;
        }
        return result + current;
    }

    public int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
