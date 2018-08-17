package src.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * <p>
 * 94. Binary Tree Inorder Traversal
 * Difficulty:Medium
 * <p>
 * Given a binary tree, return the inorder traversal of its nodes' values.
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
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
// 参考 FindBottomLeftTreeValue
// https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/45551/Preorder-Inorder-and-Postorder-Iteratively-Summarization
public class BinaryTreeInOrderTraversal {

    // 深度优先用 stack: LIFO
    // 广度优先用 queue: FIFO

    // 中序递归
    public void inOrderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.val + "  ");
            inOrderTraversalRecursive(root.right);
        }
    }

    // 中序递归，带返回值
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    // 中序非递归
    public List<Integer> inOrderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        LinkedList<TreeNode> stack = new LinkedList();
        List<Integer> list = new ArrayList<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                // 添加的位置
                list.add(node.val);
                root = node.right;
            }
        }

        return list;
    }

}
