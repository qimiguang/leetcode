package src.tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BinaryTreePostOrderTraversalTest {

    TreeNode r = new TreeNode(1);
    BinaryTreePostOrderTraversal b;

    @BeforeAll
    public void initialize() {
        TreeNode r_l = new TreeNode(2);
        TreeNode r_r = new TreeNode(3);
        TreeNode r_l_l = new TreeNode(4);
        TreeNode r_l_r = new TreeNode(5);
        TreeNode r_r_r = new TreeNode(8);

        r.left = r_l;
        r.right = r_r;
        r_l.left = r_l_l;
        r_l.right = r_l_r;
        r_r.right = r_r_r;

        b = new BinaryTreePostOrderTraversal();
    }

    @Test
    void postOrderTraversal() {
        b.postOrderTraversal(r);
    }

    @Test
    void postOrderTraversal2() {
        List<Integer> list = b.postOrderTraversal2(r);
        System.out.println(list);
        assertIterableEquals(list, Arrays.asList(4, 5, 2, 8, 3, 1));
    }
}