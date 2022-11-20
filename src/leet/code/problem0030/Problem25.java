package leet.code.problem0030;

import leet.code.tools.ListNode;

/**
 * 25. K 个一组翻转链表
 *
 * @author wbxing
 * @date 2020/12/10
 */
public class Problem25 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode p = l1;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        p = p.next;
        p.next = new ListNode(5);

        Problem25 problem25 = new Problem25();
        ListNode listNode = problem25.reverseKGroup(l1, 3);
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print("->");
            }
            listNode = listNode.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; ++i) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;
            ListNode[] reverse = reverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }

        return hair.next;
    }

    /**
     * 根据传入位置信息反转链表
     * @param head 反转开始节点
     * @param tail 反转结束节点
     * @return 返回反转后的头尾信息
     */
    public ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode p = head;
        while (pre != tail) {
            ListNode next = p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return new ListNode[]{tail, head};
    }
}
