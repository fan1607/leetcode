package alg.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _437_路径总和IIITest {

    @Test
    public void test() {
        _437_路径总和III test = new _437_路径总和III();

        Integer[] vals = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        TreeNode[] nodes = new TreeNode[vals.length];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == null)
                continue;
            nodes[i] = new TreeNode(vals[i]);
        }
        for (int i = 0; i < nodes.length; i++) {
            if (2 * i + 1 >= nodes.length)
                break;
            nodes[i].left = nodes[2 * i + 1];
            if (2 * i + 2 >= nodes.length)
                break;
            nodes[i].right = nodes[2 * i + 2];
        }
        assertEquals(3, test.pathSum(nodes[0], 8));
    }
}