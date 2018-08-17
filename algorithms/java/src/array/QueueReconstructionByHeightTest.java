package src.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueueReconstructionByHeightTest {

    @Test
    void reconstructQueue() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        QueueReconstructionByHeight q = new QueueReconstructionByHeight();
        int[][] ints = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertArrayEquals(q.reconstructQueue(people), ints);
    }

}