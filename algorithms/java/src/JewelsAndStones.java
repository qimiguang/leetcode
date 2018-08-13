package src;

import java.util.HashSet;
import java.util.Set;

/**
 * 771: Easy
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */

public class JewelsAndStones {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {
        int num = 0;

        char[] sChars = S.toCharArray();
        char[] jChars = J.toCharArray();

        // O(M+N)
        Set set = new HashSet();
        for (char jChar : jChars) {
            set.add(jChar);
        }

        for (char sChar : sChars) {
            if (set.contains(sChar)) {
                num++;
            }
        }

        return num;
    }

    public static int numJewelsInStones2(String J, String S) {
        int num = 0;

        char[] sChars = S.toCharArray();

        // O(M*N)
        for (char sChar : sChars) {
            if (J.indexOf(sChar) != -1) {
                num++;
            }
        }

        return num;
    }

    public static int numJewelsInStones3(String J, String S) {
        int num = 0;

        char[] sChars = S.toCharArray();
        char[] jChars = J.toCharArray();

        // O(M*N)
        for (char jChar : jChars) {
            for (char sChar : sChars) {
                if (jChar == sChar) {
                    num++;
                }
            }
        }

        return num;
    }

}