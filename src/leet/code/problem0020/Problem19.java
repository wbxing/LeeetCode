package leet.code.problem0020;

import leet.code.tools.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * @author wbxing
 * @date 2020/08/18
 */
public class Problem19 {
    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();

        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(1);
        ListNode tmp = l1;
        int i = 2;
        for (; i < 5; i++) {
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }

        tmp.next = new ListNode(5);

        ListNode listNode = problem19.removeNthFromEnd(l1, 0);
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print(" -> ");
            }
            listNode = listNode.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 0 || head == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode res = p2;
        for (int i = 0; i < n; i++) {
            if (p1 != null) {
                p1 = p1.next;
            } else {
                return head;
            }
        }
        if (p1 == null) {
            return head.next;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p2 == null) {
            return head;
        }
        p2.next = p2.next.next;
        return res;
    }
}
