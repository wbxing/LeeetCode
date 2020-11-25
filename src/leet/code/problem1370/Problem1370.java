package leet.code.problem1370;


/**
 * 1370. 上升下降字符串
 * @author wbxing
 * @date 2020/11/25
 */
public class Problem1370 {

    public static void main(String[] args) {
        Problem1370 problem1370 = new Problem1370();
        System.out.println(problem1370.sortString("aaaabbbbcccc"));
    }

    public String sortString(String s) {

        int cnt = 26;
        int[] num = new int[cnt];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            for (int i = 0; i < cnt; i++) {
                if (num[i] > 0) {
                    result.append((char) (i + 'a'));
                    num[i]--;
                }
            }
            for (int i = cnt - 1; i >= 0; i--) {
                if (num[i] > 0) {
                    result.append((char) (i + 'a'));
                    num[i]--;
                }
            }
        }
        return result.toString();
    }

}
