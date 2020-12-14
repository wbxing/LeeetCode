package leet.code.problem0170;

/**
 * 168. Excel表列名称
 *
 * @author wbxing
 * @date 2020/12/14
 */
public class Problem168 {

    public static void main(String[] args) {
        Problem168 problem168 = new Problem168();
        System.out.println(problem168.convertToTitle(701));
    }

    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        int cnt = 'Z' - 'A' + 1;
        while (n > cnt) {
            n -= cnt;
            count++;
        }
        if (count > 0) {
            result.append(convertToTitle(count));
        }
        result.append((char) (n - 1 + 'A'));
        return result.toString();
    }
}
