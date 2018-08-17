package src.string;

import org.junit.jupiter.api.Test;

class PalindromicSubstringsTest {

    @Test
    void countSubstrings() {

        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings2("abc"));
        System.out.println(p.countSubstrings2("aba"));

    }
}