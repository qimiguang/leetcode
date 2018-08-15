package src.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomSortStringTest {

    @Test
    void customSortString() {
        CustomSortString customSortString = new CustomSortString();
        assertEquals(customSortString.customSortString("cba", "abcd"), "cbad");
        assertEquals(customSortString.customSortString("cba", "abccdd"), "ccbadd");

    }

}