package src.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class FindAllDuplicatesInAnArrayTest {

    @Test
    void findDuplicates() {
        FindAllDuplicatesInAnArray f = new FindAllDuplicatesInAnArray();
        List<Integer> duplicates = f.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertIterableEquals(duplicates, Arrays.asList(2, 3));
    }

}