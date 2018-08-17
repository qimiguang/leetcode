package src.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    // 前序递归
    public void preOrderTraversalRecursive(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "  ");
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
        }
    }

    // 前序非递归
    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + "  ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    // 前序非递归
    public List<Integer> preOrderTraversal2(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                // 添加的位置
                list.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop().right;
            }
        }

        return list;
    }

}
