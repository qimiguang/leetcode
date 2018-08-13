package src.tree;

/**
 * 617: Easy
 * <p>
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * <p>
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 * <p>
 * Example 1:
 * Input:
 * Tree 1                     Tree 2
 * 1                         2
 * / \                       / \
 * 3   2                     1   3
 * /                           \   \
 * 5                             4   7
 * Output:
 * Merged tree:
 * 3
 * / \
 * 4   5
 * / \   \
 * 5   4   7
 * Note: The merging process must start from the root nodes of both trees.
 */
public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1_left = new TreeNode(3);
        TreeNode t1_right = new TreeNode(2);
        t1.left = t1_left;
        t1.right = t1_right;
        TreeNode t1_left_left = new TreeNode(5);
        t1_left.left = t1_left_left;

        TreeNode t2 = new TreeNode(2);

        TreeNode t2_left = new TreeNode(1);

        TreeNode t2_right = new TreeNode(3);
        t2.left = t2_left;
        t2.right = t2_right;
        t2_left.left = null;

        t2_right.left = null;
        TreeNode t2_right_right = new TreeNode(7);
        t2_right.right = t2_right_right;

        TreeNode treeNode = mergeTrees(t1, t2);
        System.out.println(treeNode);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode t = new TreeNode(t1.val + t2.val);
        t.left = mergeTrees(t1.left, t2.left);
        t.right  = mergeTrees(t1.right, t2.right);

        return t;
    }

}
