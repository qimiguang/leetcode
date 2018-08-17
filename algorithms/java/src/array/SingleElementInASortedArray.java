package src.array;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 * <p>
 * 540. Single Element in a Sorted Array
 * Difficulty:Medium
 * <p>
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
 * <p>
 * Example 1:
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 * Note: Your solution should run in O(log n) time and O(1) space.
 */
public class SingleElementInASortedArray {

    // 二分查找
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            // 这个地方需要特别注意
            if (mid % 2 == 1) {
                mid--;
            }

            // 单个字符在这之后
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                // 单个字符在这之前
                left = mid + 2;
            }
        }
        return nums[left];
    }

}
