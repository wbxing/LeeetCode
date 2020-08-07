package leet.code.problem0020;

import java.util.Stack;

/**
 * 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class Problem20 {
    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        System.out.println(problem20.isValid(""));
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (char c : chars) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    characters.push(c);
                    break;
                case ')':
                    if (!characters.isEmpty() && characters.peek() == '(') {
                        characters.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (!characters.isEmpty() && characters.peek() == '[') {
                        characters.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if (!characters.isEmpty() && characters.peek() == '{') {
                        characters.pop();
                        break;
                    } else {
                        return false;
                    }
                default:
                    return false;
            }
        }
        return characters.isEmpty();
    }
}
