package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

public class _783_二叉搜索树节点最小距离Test {

    @Test
    public void test() {
        Integer[] values = new Integer[]{90, 69, null, 49, 89, null, 52, null, null, null, null};
        TreeNode root = TreeUtil.buildTree(values);
        _783_二叉搜索树节点最小距离 test = new _783_二叉搜索树节点最小距离();
        Assert.assertEquals(1, test.minDiffInBST(root));
    }
}