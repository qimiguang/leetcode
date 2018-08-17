package src.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleElementInASortedArrayTest {

    @Test
    void singleNonDuplicate() {
        SingleElementInASortedArray s = new SingleElementInASortedArray();
        int[] ints = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        assertEquals(s.singleNonDuplicate(ints), 2);

        int[] ints2 = {3, 3, 7, 7, 10, 11, 11};
        assertEquals(s.singleNonDuplicate(ints2), 10);
    }
}