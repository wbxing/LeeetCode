package leet.code.problem0010;

/**
 * 6. Z 字形变换
 *
 * @author wbxing
 * @date 2020/10/02
 */
public class Problem06 {

    public static void main(String[] args) {
        Problem06 problem06 = new Problem06();
        System.out.println(problem06.convert("LEETCODEISHIRING", 3));
    }


    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        int len = s.length();
        StringBuilder result = new StringBuilder();
        int count = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < len - i; j += count) {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1) {
                    if (j - i + count < len) {
                        result.append(s.charAt(j - i + count));
                    }
                }
            }
        }
        return result.toString();
    }

}
