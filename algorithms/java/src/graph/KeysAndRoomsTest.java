package src.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KeysAndRoomsTest {

    @Test
    void canVisitAllRooms() {
        KeysAndRooms k = new KeysAndRooms();

        List list = new ArrayList<Integer>();
        List l0 = Arrays.asList(1);
        List l1 = Arrays.asList(2);
        List l2 = Arrays.asList(3);
        List l3 = Arrays.asList();

        list.add(l0);
        list.add(l1);
        list.add(l2);
        list.add(l3);

        assertTrue(k.canVisitAllRooms(list));

        list.clear();
        l0 = Arrays.asList(1, 3);
        l1 = Arrays.asList(3, 0, 1);
        l2 = Arrays.asList(2);
        l3 = Arrays.asList(0);

        list.add(l0);
        list.add(l1);
        list.add(l2);
        list.add(l3);

        assertFalse(k.canVisitAllRooms(list));
    }

}