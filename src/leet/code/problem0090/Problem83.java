package leet.code.problem0090;

/**
 * 83. 删除排序链表中的重复元素
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * @author wbxing
 * @date 2020/08/16
 */
public class Problem83 {

    public static void main(String[] args) {

        Problem83 problem83 = new Problem83();
        ListNode l1 = new ListNode(1);
        ListNode tmp = l1;
        tmp.next = new ListNode(1);
        tmp = tmp.next;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(4);
        tmp = tmp.next;
        tmp.next = new ListNode(5);
        tmp = tmp.next;
        tmp.next = new ListNode(5);

        ListNode res = problem83.deleteDuplicates(l1);

        while (res != null) {
            System.out.print(res.val);
            if (res.next != null) {
                System.out.print(" -> ");
            }
            res = res.next;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }
        ListNode res = new ListNode(head.val);
        ListNode tmp = res;

        while (head != null) {
            if (tmp.val != head.val) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
            head = head.next;
        }

        return res;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
