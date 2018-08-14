package src.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/description/
 * <p>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * <p>
 * Input:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) {
            return ans;
        }

        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;

        // 核心就是：圈越来越小，每次 while 循环＝转了一圈＝row_start+1, row_end-1, col_start+1, col_end-1
        while (row_start <= row_end && col_start <= col_end) {
            // row move right
            for (int i = col_start; i <= col_end; i++) {
                ans.add(matrix[row_start][i]);
            }
            row_start++;

            // col move down
            for (int i = row_start; i <= row_end; i++) {
                ans.add(matrix[i][col_end]);
            }
            col_end--;

            // row move left
            if (row_start <= row_end) {
                for (int i = col_end; i >= col_start; i--) {
                    ans.add(matrix[row_end][i]);
                }
            }
            row_end--;

            // col move up
            if (col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    ans.add(matrix[i][col_start]);
                }
            }
            col_start++;
        }

        return ans;
    }

}
