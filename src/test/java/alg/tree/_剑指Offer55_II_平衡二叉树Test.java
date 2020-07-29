package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _剑指Offer55_II_平衡二叉树Test {

    @Test
    public void isBalanced() {
        _剑指Offer55_II_平衡二叉树 test = new _剑指Offer55_II_平衡二叉树();

        Integer[] values = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeUtil.buildTree(values);
        assertTrue(test.isBalanced(root));
        assertTrue(test.isBalanced2(root));

        values = new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4};
        root = TreeUtil.buildTree(values);
        assertFalse(test.isBalanced(root));
        assertFalse(test.isBalanced2(root));

        values = new Integer[]{};
        root = TreeUtil.buildTree(values);
        assertTrue(test.isBalanced(root));
        assertTrue(test.isBalanced2(root));
    }
}