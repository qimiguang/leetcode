package src.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListCycleIITest {

    @Test
    void detectCycle() {
        LinkedListCycleII cycleII = new LinkedListCycleII();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        assertNull(cycleII.detectCycle(l1));
    }

    @Test
    void detectCycleExist() {
        LinkedListCycleII cycleII = new LinkedListCycleII();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l2;
        assertEquals(cycleII.detectCycle(l1), l2);
    }

}