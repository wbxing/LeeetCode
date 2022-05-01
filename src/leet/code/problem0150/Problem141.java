package leet.code.problem0150;

import leet.code.tools.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 *
 * @author wbxing
 * @date 2020/09/27
 */
public class Problem141 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);

        Problem141 problem141 = new Problem141();
        System.out.println(problem141.hasCycle(listNode));

    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }
            current = current.next;
        }
        return false;
    }
}

