package src.array;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 * <p>
 * 238. Product of Array Except Self
 * <p>
 * Difficulty:Medium
 * <p>
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product(乘积) of all the elements of nums except nums[i].
 * <p>
 * Example:
 * <p>
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Note: Please solve it without division and in O(n).
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {

    // 正确的解法
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        // res 存储每个 index 左侧所有数据的乘积
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        // res 存储每个 index 右侧侧所有数据的乘积
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    // bug: 当存在 0 时
    public int[] productExceptSelf2(int[] nums) {
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            sum *= nums[i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum / nums[i];
        }
        return result;
    }

}
