package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 728: Easy
 * <p>
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
        System.out.println(list);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();

        for (; left <= right; left++) {
            char[] chars = String.valueOf(left).toCharArray();
            boolean flag = true;
            for (char aChar : chars) {
                if (aChar == '0') {
                    flag = false;
                    break;
                }

                int t = Integer.valueOf(aChar) - 48;
                if (left % t != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(left);
            }
        }

        return list;
    }

    public static List<Integer> selfDividingNumbers2(int left, int right) {
        List<Integer> res = new ArrayList();
        for (int i = left; i <= right; i++) {
            int n = i;
            for (; n > 0; n /= 10) {
                if (n % 10 == 0 || i % (n % 10) != 0) {
                    break;
                }
            }

            if (n == 0) {
                res.add(i);
            }
        }
        return res;
    }

}
