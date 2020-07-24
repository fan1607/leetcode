package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _面试题_0404_检查平衡性Test {

    @Test
    public void test() {
        Integer[] values = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeUtil.buildTree(values);
        assertTrue(_面试题_0404_检查平衡性.isBalanced(root));

        values = new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4};
        root = TreeUtil.buildTree(values);
        assertFalse(_面试题_0404_检查平衡性.isBalanced(root));

        values = new Integer[]{};
        root = TreeUtil.buildTree(values);
        assertTrue(_面试题_0404_检查平衡性.isBalanced(root));

        values = new Integer[]{1, 2, 2, 3, null, null, 3, 4, null, null, 4};
        root = TreeUtil.buildTree(values);
        assertFalse(_面试题_0404_检查平衡性.isBalanced(root));
    }
}