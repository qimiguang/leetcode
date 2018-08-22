package src.list;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/description/
 * <p>
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Note: Do not modify the linked list.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                ListNode slow2 = head;
                // 核心在于这里怎么理解
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }

                return slow;
            }
        }

        return null;
    }
}
