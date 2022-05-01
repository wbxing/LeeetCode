package leet.code.problem0030;

import leet.code.tools.ListNode;

/**
 * 合并两个有序链表
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author wbxing
 * @date 2020/08/11
 */
public class Problem21 {
    public static void main(String[] args) {
        Problem21 problem21 = new Problem21();
        ListNode l1 = new ListNode(1);
        ListNode p = l1;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        p = l2;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);

        ListNode l3 = problem21.mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.print(l3.val);
            if (l3.next != null) {
                System.out.print(" -> ");
            }
            l3 = l3.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode l3 = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = l3;

        while (p1 != null && p2 != null) {
            int v1 = p1.val;
            int v2 = p2.val;
            if (v1 == v2) {
                p3.next = new ListNode(v1, new ListNode(v2));
                p1 = p1.next;
                p2 = p2.next;
                p3 = p3.next;
            } else if (v1 < v2) {
                p3.next = new ListNode(v1);
                p1 = p1.next;
            } else {
                p3.next = new ListNode(v2);
                p2 = p2.next;
            }
            p3 = p3.next;
        }

        while (p1 != null) {
            p3.next = new ListNode(p1.val);
            p1 = p1.next;
            p3 = p3.next;
        }
        while (p2 != null) {
            p3.next = new ListNode(p2.val);
            p2 = p2.next;
            p3 = p3.next;
        }

        return l3.next;
    }
}

