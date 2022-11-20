package leet.code.problem0030;

import leet.code.tools.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * @author wbxing
 * @date 2020/12/10
 */
public class Problem24 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode p = l1;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);

        Problem24 problem24 = new Problem24();
        ListNode listNode = problem24.swapPairs(l1);
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print("->");
            }
            listNode = listNode.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode result = head.next;
        head.next = swapPairs(result.next);
        result.next = head;
        return result;
    }
}
