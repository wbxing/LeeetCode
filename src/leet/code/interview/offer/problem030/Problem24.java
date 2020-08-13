package leet.code.interview.offer.problem030;

/**
 * 剑指 Offer 24. 反转链表
 * <p>
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * @author wbxing
 * @date 2020/08/13
 */
public class Problem24 {

    public static void main(String[] args) {
        Problem24 problem24 = new Problem24();

        ListNode l1 = new ListNode(0);
        ListNode temp1 = l1;
        temp1.next = new ListNode(1);
        temp1 = temp1.next;
        temp1.next = new ListNode(2);

        ListNode l2 = problem24.reverseList(l1);

        while (l2 != null) {
            System.out.print(l2.val);
            if (l2.next != null) {
                System.out.print(" -> ");
            }
            l2 = l2.next;
        }
    }


    public ListNode reverseList(ListNode head) {

        ListNode result = null;
        ListNode current = head;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = result;
            result = current;
            current = tmp;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
