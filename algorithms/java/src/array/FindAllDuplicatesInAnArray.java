package src.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 * <p>
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 */
// review
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> newList = new ArrayList<Integer>();     // creating a new List
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);             // Taking the absolute value to find index
            if (nums[index - 1] > 0) {
                // core
                nums[index - 1] = -nums[index - 1];
            } else {
                // If it is not greater than 0 (i.e) negative then the number is a duplicate
                newList.add(Math.abs(nums[i]));
            }
        }

        return newList;
    }

}
