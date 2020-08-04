package leet.code.problem0010;

/**
 * 两数相加
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 */
public class Problem02 {

    public static void main(String[] args) {
        Problem02 problem2 = new Problem02();

        ListNode l1 = new ListNode(0);
        ListNode num1 = l1;
        num1.next = new ListNode(3);
        num1 = num1.next;
        num1.next = new ListNode(7);
        num1 = num1.next;
        num1.next = new ListNode(2);

        ListNode l2 = new ListNode(0);
        ListNode num2 = l2;
        num2.next = new ListNode(7);
        num2 = num2.next;
        num2.next = new ListNode(3);
        num2 = num2.next;
        num2.next = new ListNode(2);
//        while (l1 != null) {
//            System.out.print(l1.val);
//            l1 = l1.next;
//            if (l1 != null) {
//                System.out.print(" -> ");
//            }
//        }
//        while (l2 != null) {
//            System.out.print(l2.val);
//            l2 = l2.next;
//            if (l2 != null) {
//                System.out.print(" -> ");
//            }
//        }

        ListNode res = problem2.addTwoNumbers(l1.next, l2.next);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
            if (res != null) {
                System.out.print(" -> ");
            }
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode res = l3;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;
            if (l1 != null) {
                num1 = l1.val;
            }
            if (l2 != null) {
                num2 = l2.val;
            }
            int sum = num1 + num2 + flag;
            if (sum >= 10) {
                sum %= 10;
                flag = 1;
            } else {
                flag = 0;
            }
            res.next = new ListNode(sum);
            res = res.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (flag > 0) {
            res.next = new ListNode(flag);
        }
        return l3.next;
    }
}
