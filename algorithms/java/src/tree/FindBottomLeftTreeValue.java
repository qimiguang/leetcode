package src.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/description/
 * <p>
 * 513. Find Bottom Left Tree Value
 * Difficulty:Medium
 * <p>
 * Given a binary tree, find the leftmost value in the last row of the tree.
 * <p>
 * Example 1:
 * Input:
 * <p>
 * 2
 * / \
 * 1   3
 * <p>
 * Output:
 * 1
 * Example 2:
 * Input:
 * <p>
 * 1
 * / \
 * 2   3
 * /   / \
 * 4   5   6
 * /
 * 7
 * <p>
 * Output:
 * 7
 * Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
// BFS(宽度优先＝层序遍历)
public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        // 通过 queue FIFO 来实现
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.poll();

            if (root.right != null) {
                queue.add(root.right);
            }

            if (root.left != null) {
                queue.add(root.left);
            }
        }

        return root.val;
    }

}
