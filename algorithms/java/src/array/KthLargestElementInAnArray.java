package src.array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 * <p>
 * 215. Kth Largest Element in an Array
 * <p>
 * Difficulty:Medium
 * <p>
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
// 无序数组, 按数字大小, 找 TOP K
public class KthLargestElementInAnArray {

    // O(n * log n) running time + O(1) memory
    public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }

    // O(n * log k) + running time + O(K) memory
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.poll();
    }

}
