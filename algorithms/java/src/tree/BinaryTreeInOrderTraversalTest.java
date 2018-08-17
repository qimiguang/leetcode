package src.tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinaryTreeInOrderTraversalTest {

    TreeNode r = new TreeNode(1);
    BinaryTreeInOrderTraversal b;

    @BeforeAll
    public void initialize() {
        TreeNode r_l = new TreeNode(2);
        TreeNode r_r = new TreeNode(3);
        TreeNode r_l_l = new TreeNode(4);
        TreeNode r_l_r = new TreeNode(6);
        TreeNode r_r_r = new TreeNode(8);

        r.left = r_l;
        r.right = r_r;
        r_l.left = r_l_l;
        r_l.right = r_l_r;
        r_r.right = r_r_r;

        b = new BinaryTreeInOrderTraversal();
    }

    @Test
    void inOrderTraversal() {
        TreeNode r = new TreeNode(1);
        TreeNode r_l = new TreeNode(2);
        TreeNode r_r = new TreeNode(3);
        TreeNode r_l_l = new TreeNode(4);
        TreeNode r_l_r = new TreeNode(6);
        TreeNode r_r_r = new TreeNode(8);

        r.left = r_l;
        r.right = r_r;
        r_l.left = r_l_l;
        r_l.right = r_l_r;
        r_r.right = r_r_r;

        b.inOrderTraversalRecursive(r);
        System.out.println("");
        b.inOrderTraversal(r);
        System.out.println("");
    }
}