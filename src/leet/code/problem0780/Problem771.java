package leet.code.problem0780;

/**
 * 771. 宝石与石头
 *
 * @author wbxing
 * @date 2020/10/02
 */
public class Problem771 {
    public static void main(String[] args) {
        String j = "z";
        String s = "ZZ";
        Problem771 problem771 = new Problem771();
        System.out.println(problem771.numJewelsInStones(j, s));
    }

    public int numJewelsInStones(String J, String S) {
        if (J == null || J.length() == 0) {
            return 0;
        }
        if (S == null || S.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
