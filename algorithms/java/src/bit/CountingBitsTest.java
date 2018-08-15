package src.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class CountingBitsTest {

    @Test
    public void testCountBits() {
        CountingBits countingBits = new CountingBits();

        assertArrayEquals(countingBits.countBits2(5), new int[]{0, 1, 1, 2, 1, 2});
    }

}
