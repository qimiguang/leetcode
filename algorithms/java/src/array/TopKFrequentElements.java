package src.array;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 * <p>
 * 347. Top K Frequent Elements
 * <p>
 * Difficulty:Medium
 * <p>
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * Note:
 * <p>
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
// 无序数组, 按出现次数, 找 TOP K
// 用到了 Hash + MinHeap
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 按照 value 降序
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                // 只位置 k 个数据，从 value 最小的尾部弹出一个来
                minHeap.poll();
            }
        }

        LinkedList<Integer> result = new LinkedList<>();
        while (result.size() < k) {
            result.addFirst(minHeap.poll().getKey());
        }

        return result;
    }

}
