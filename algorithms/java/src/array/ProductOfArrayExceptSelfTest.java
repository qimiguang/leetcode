package src.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] result = p.productExceptSelf(new int[]{1, 2, 3, 4});

        System.out.println(Arrays.asList(result));
        assertArrayEquals(result, new int[]{24, 12, 8, 6});
    }

    @Test
    void productExceptSelf2() {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        int[] result = p.productExceptSelf2(new int[]{1, 2, 3, 4});

        System.out.println(Arrays.asList(result));
        assertArrayEquals(result, new int[]{24, 12, 8, 6});
    }

}