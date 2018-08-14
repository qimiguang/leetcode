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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        ListNode l = middleNode2(l1);
        System.out.println(l);
    }

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

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

}