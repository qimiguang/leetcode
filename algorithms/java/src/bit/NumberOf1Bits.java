package src.bit;

/**
 * https://leetcode.com/problems/number-of-1-bits/description/
 * <p>
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * <p>
 * Example 1:
 * <p>
 * Input: 11
 * Output: 3
 * Explanation: Integer 11 has binary representation 00000000000000000000000000001011
 * Example 2:
 * <p>
 * Input: 128
 * Output: 1
 * Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 */
// hamming weight
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            // 需要改变 n 的值，可以优化为下面的方法
            count += n & 1;
            n = n >> 1;
        }

        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count += 1;
            }
            mask <<= 1;
        }

        return count;
    }

}
