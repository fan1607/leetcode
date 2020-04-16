package alg.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class _404_左叶子之和Test {

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        _404_左叶子之和 test = new _404_左叶子之和();
        assertEquals(24, test.sumOfLeftLeaves(root));

        right.right.left = new TreeNode(1);
        assertEquals(25, test.sumOfLeftLeaves(root));
    }

}