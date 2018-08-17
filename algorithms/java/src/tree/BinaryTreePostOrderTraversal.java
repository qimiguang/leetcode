package src.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * 145. Binary Tree Postorder Traversal
 * <p>
 * Difficulty:Hard
 * <p>
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * <p>
 * Example:
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [3,2,1]
 */
public class BinaryTreePostOrderTraversal {

    // 后序递归
    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.val + "  ");
        }
    }

    // 后序非递归
    public List<Integer> postOrderTraversal2(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        LinkedList<TreeNode> stack = new LinkedList();
        LinkedList<Integer> result = new LinkedList<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                // core
                result.addFirst(root.val);
                root = root.right;
            } else {
                TreeNode node = stack.pop();
                root = node.left;
            }
        }

        return result;
    }

}
