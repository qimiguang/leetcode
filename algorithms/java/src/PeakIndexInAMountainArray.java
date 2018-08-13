package src;

/**
 * 852: Easy
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * <p>
 * Example 1:
 * <p>
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [0,2,1,0]
 * Output: 1
 * Note:
 * <p>
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 */
public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] a = {0, 2, 4, 6, 8, 1, 0};
        int x = peakIndexInMountainArray(a);
        System.out.println(a[x]);
    }

    public static int peakIndexInMountainArray(int[] a) {
        int left = 0, right = a.length - 1, mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (a[mid] < a[mid + 1]) {
                left = mid;
            } else if (a[mid] > a[mid - 1]) {
                return mid;
            } else {
                right = mid;
            }
        }

        return 0;
    }

}
