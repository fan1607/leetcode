package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1022_从根到叶的二进制数之和Test {

    @Test
    public void sumRootToLeaf() {
        _1022_从根到叶的二进制数之和 test = new _1022_从根到叶的二进制数之和();

        Integer[] values = new Integer[]{1, 0, 1, 0, 1, 0, 1};
        TreeNode root = TreeUtil.buildTree(values);

        assertEquals(22, test.sumRootToLeaf(root));
        assertEquals(22, test.sumRootToLeaf2(root));
    }
}