package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

public class _938_二叉搜索树的范围和Test {

    @Test
    public void rangeSumBST() {
        Integer[] values = new Integer[]{18, 9, 27, 6, 15, 24, 30, 3, null, 12, null, 21};
        TreeNode root = TreeUtil.buildTree(values);
        _938_二叉搜索树的范围和 test = new _938_二叉搜索树的范围和();
        Assert.assertEquals(63, test.rangeSumBST(root, 18, 24));
        Assert.assertEquals(63, test.rangeSumBST2(root, 18, 24));
    }
}