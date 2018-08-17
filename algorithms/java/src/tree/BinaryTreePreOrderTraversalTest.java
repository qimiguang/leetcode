package src.tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinaryTreePreOrderTraversalTest {

    TreeNode r = new TreeNode(1);
    BinaryTreePreOrderTraversal b;

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

        b = new BinaryTreePreOrderTraversal();
    }

    @Test
    void preOrderTraversalRecursive() {
        b.preOrderTraversalRecursive(r);
        System.out.println("");
    }

    @Test
    void preOrderTraversal() {
        b.preOrderTraversal(r);
        System.out.println("");
    }

    @Test
    void preOrderTraversal2() {
        b.preOrderTraversal2(r);
        System.out.println("");
    }
}