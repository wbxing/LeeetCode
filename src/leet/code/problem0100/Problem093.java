package leet.code.problem0100;

import java.util.ArrayList;
import java.util.List;

/**
 * 复原IP地址
 * <p>
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 *
 * @author wbxing
 * @date 2020/08/11
 */
public class Problem093 {

    public static void main(String[] args) {
        Problem093 problem093 = new Problem093();
        System.out.println(problem093.restoreIpAddresses("000000000000"));
    }

    public List<String> restoreIpAddresses(String s) {

        if (s.length() > 12 || s.length() < 4) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        if (length == 4) {
            for (int i = 0; i < 4; i++) {
                sb.append(s.charAt(i));
                sb.append(".");
            }
            String substring = sb.substring(0, 7);
            list.add(substring);
            return list;
        }
        if (length == 12) {
            for (int i = 0; i < 12; i += 3) {
                if (Integer.parseInt(s.substring(i, i + 3)) > 255 || s.substring(i, i + 3).startsWith("0")) {
                    return new ArrayList<>();
                }
                sb.append(s, i, i + 3);
                sb.append(".");
            }
            String substring = sb.substring(0, 15);
            list.add(substring);
            return list;
        }
        for (int i = 1; i < Math.min(4, length - 2); i++) {
            for (int j = i + 1; j < Math.min(i + 4, length - 1); j++) {
                for (int k = j + 1; k < Math.min(j + 4, length); k++) {
                    if (length - k > 3) {
                        continue;
                    }
                    List<String> temp = new ArrayList<>();
                    boolean flag = false;
                    temp.add(s.substring(0, i));
                    temp.add(s.substring(i, j));
                    temp.add(s.substring(j, k));
                    temp.add(s.substring(k));
                    for (String str : temp) {
                        if (str.length() > 3) {
                            flag = true;
                            break;
                        }
                        if (str.charAt(0) == '0' && !"0".equals(str)) {
                            flag = true;
                            break;
                        }
                        if (Integer.parseInt(str) > 255) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        continue;
                    }
                    list.add(temp.get(0) + "." + temp.get(1) + "." + temp.get(2) + "." + temp.get(3));
                }
            }
        }
        return list;
    }

}
