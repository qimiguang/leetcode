package src.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindBottomLeftTreeValueTest {

    @Test
    void findBottomLeftValue() {
        TreeNode root = new TreeNode(2);
        TreeNode root_left = new TreeNode(1);
        TreeNode root_right = new TreeNode(3);
        root.left = root_left;
        root.right = root_right;

        FindBottomLeftTreeValue f = new FindBottomLeftTreeValue();
        assertEquals(f.findBottomLeftValue(root), 1);
    }

}