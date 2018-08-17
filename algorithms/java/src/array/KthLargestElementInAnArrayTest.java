package src.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAnArrayTest {

    int[] ints = {3, 2, 3, 1, 2, 4, 5, 5, 6};

    @Test
    void findKthLargest() {
        KthLargestElementInAnArray k = new KthLargestElementInAnArray();
        assertEquals(k.findKthLargest(ints, 4), 4);
    }

    @Test
    void findKthLargest2() {
        KthLargestElementInAnArray k = new KthLargestElementInAnArray();
        assertEquals(k.findKthLargest2(ints, 4), 4);
    }
}