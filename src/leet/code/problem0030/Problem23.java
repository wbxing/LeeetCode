package leet.code.problem0030;

import leet.code.tools.ListNode;

/**
 * 23. 合并K个升序链表
 *
 * @author wbxing
 * @date 2020/11/25
 */
public class Problem23 {

    public static void main(String[] args) {

        Problem23 problem23 = new Problem23();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);

        ListNode p = l1;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);
        p = l2;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = l3;
        p.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{l1, l2, l3};

        ListNode res = problem23.mergeKLists(lists);
        while (res != null) {
            System.out.print(res.val);
            if (res.next != null) {
                System.out.print(" -> ");
            }
            res = res.next;
        }

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (ListNode list : lists) {
            ans = mergeTwoLists(ans, list);
        }
        return ans;
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }
}
