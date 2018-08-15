package src.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/description/
 * <p>
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
 * <p>
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * <p>
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * <p>
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 * <p>
 * Note:
 * <p>
 * Both of the given trees will have between 1 and 100 nodes.
 */
// DFS: Depth First Search
public class LeafSimilarTrees {

    // Complexity Analysis
    //
    //Time Complexity: O(T_1 + T_2), where T_1, T_2T are the lengths of the given trees.
    //
    //Space Complexity: O(T_1 + T_2), the space used in storing the leaf values.
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        dfs(root1, list1);
        List<Integer> list2 = new ArrayList<Integer>();
        dfs(root2, list2);

        // 无序数组的比较
        return list1.equals(list2);
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        dfs(node.left, list);
        dfs(node.right, list);
    }

}
