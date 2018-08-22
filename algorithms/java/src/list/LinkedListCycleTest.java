package src.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListCycleTest {

    @Test
    void notHasCycle() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        LinkedListCycle cycle = new LinkedListCycle();
        assertEquals(cycle.hasCycle(l1), false);
    }

    @Test
    void hasCycle() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        l2.next = l1;

        LinkedListCycle cycle = new LinkedListCycle();
        assertEquals(cycle.hasCycle(l1), true);
    }

}