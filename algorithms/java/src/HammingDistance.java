package src;

/**
 * 461: Easy
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 231.
 * <p>
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance {

    public static void main(String[] args) {
        Integer x = 1;
        Integer y = 4;
        System.out.println(hammingDistance3(x, y));
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int n = x ^ y;
        char[] s = Integer.toBinaryString(n).toCharArray();
        for (char c : s) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static int hammingDistance2(int x, int y) {
        int count = 0;

        int n = x ^ y;
        for (int i = 0; i < 32; i++) {
            count += ((n >> i) & 1);
        }

        return count;
    }

    public static int hammingDistance3(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
