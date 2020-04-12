package alg.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class _111_二叉树的最小深度Test {

    @Test
    public void test() {
        _111_二叉树的最小深度 test = new _111_二叉树的最小深度();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(2, test.minDepth(root));

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        assertEquals(2, test.minDepth(root));
    }

}