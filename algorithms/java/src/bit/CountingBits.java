package src.bit;

/**
 * https://leetcode.com/problems/counting-bits/description/
 * <p>
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: [0,1,1]
 * Example 2:
 * <p>
 * Input: 5
 * Output: [0,1,1,2,1,2]
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 */
public class CountingBits {

    // O(n*sizeof(integer))
    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            char[] bits = Integer.toBinaryString(i).toCharArray();
            int count = 0;
            for (char bit : bits) {
                if (bit == '1') {
                    count++;
                }
            }

            counts[i] = count;
        }
        return counts;
    }

    // O(n)
    public int[] countBits2(int num) {
        int[] counts = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            counts[i] = counts[i >> 1] + i & 1;
        }

        return counts;
    }

}
