package src.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        TopKFrequentElements t = new TopKFrequentElements();
        List<Integer> result = t.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3}, 2);
        System.out.println(result);
        assertIterableEquals(result, Arrays.asList(3, 1));
    }
}