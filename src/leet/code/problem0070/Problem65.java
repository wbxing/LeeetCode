package leet.code.problem0070;

/**
 * 65. 有效数字
 * @author wbxing
 * @date 2020/11/14
 */
public class Problem65 {

    public static void main(String[] args) {
        Problem65 problem65 = new Problem65();
        System.out.println(problem65.isNumber("0e5"));
    }

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        boolean isNum = false;
        boolean isDot = false;
        boolean isE = false;
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                isNum = true;
            } else if (chars[i] == '.') {
                if (isDot || isE) {
                    return false;
                }
                isDot = true;
            } else if (chars[i] == 'E' || chars[i] == 'e') {
                if (isE || !isNum) {
                    return false;
                }
                isE = true;
                isNum = false;
            } else if (chars[i] == '+' || chars[i] == '-') {
                if (i != 0 && chars[i - 1] != 'e' && chars[i - 1] != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return isNum;
    }

}
