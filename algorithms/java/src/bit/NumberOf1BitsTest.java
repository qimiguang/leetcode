package src.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class NumberOf1BitsTest {

    @Test
    public void testCountBits() {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        assertEquals(numberOf1Bits.hammingWeight2(11), 3);
    }
}
