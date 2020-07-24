package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _437_路径总和IIITest {

    @Test
    public void test() {
        _437_路径总和III test = new _437_路径总和III();

        Integer[] vals = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        TreeNode root = TreeUtil.buildTree(vals);
        assertEquals(3, test.pathSum(root, 8));
    }
}