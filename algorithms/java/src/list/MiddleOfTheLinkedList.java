package src.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 876: Easy
 * <p>
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list
 */
public class MiddleOfTheLinkedList {

    public static ListNode middleNode(ListNode head) {
        List<ListNode> array = new ArrayList();
        while (head.next != null) {
            array.add(head);
            head = head.next;
        }
        array.add(head);
        return array.get(array.size() / 2);
    }

    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}

