package src.matrix;

/**
 * https://leetcode.com/problems/score-after-flipping-matrix/description/
 * <p>
 * <p>
 * We have a two dimensional matrix A where each value is 0 or 1.
 * <p>
 * A move consists of choosing any row or column, and toggling each value in that row or column: changing all 0s to 1s, and all 1s to 0s.
 * <p>
 * After making any number of moves, every row of this matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 * <p>
 * Return the highest possible score.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * Output: 39
 * Explanation:
 * Toggled to [[1,1,1,1],[1,0,0,1],[1,1,1,1]].
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 20
 * 1 <= A[0].length <= 20
 * A[i][j] is 0 or 1.
 */
public class ScoreAfterFlippingMatrix {

    public static void main(String[] args) {
        int[][] A = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int i = matrixScore(A);
        System.out.println(i);
    }

    // 第一列需要全为 1，通过 toggle row
    // 之后所有列都通过 toggle column 来尽可能多的为 1
    public static int matrixScore(int[][] A) {
        // 第一列通过 toggle row 一定全部都会变成 1
        int row = A.length;
        int col = A[0].length;
        int num = (1 << (col - 1)) * row;

        // 遍历列
        for (int i = 1; i < col; i++) {
            // 当前列中为 1 的个数
            int current = 0;
            for (int j = 0; j < row; j++) {
                // 当前位置与行首的原始值是否相等，相等的话，当前位置值也一定变成了 1，不等的话，由于行首变成1， 当前位置变成 0
                current += (A[j][i] == A[j][0] ? 1 : 0);
            }
            num += Math.max(current, row - current) * (1 << (col - 1 - i));
        }

        return num;
    }

}
