package alg.tree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _100_相同的树Test {

    @Test
    public void test() {
        TreeNode n11 = new TreeNode(1);
        n11.left = new TreeNode(2);
        n11.right = new TreeNode(3);
        TreeNode n12 = new TreeNode(1);
        n12.left = new TreeNode(2);
        n12.right = new TreeNode(3);
        assertTrue(_100_相同的树.isSameTree(n11, n12));

        TreeNode n21 = new TreeNode(1);
        n21.left = new TreeNode(2);
        TreeNode n22 = new TreeNode(1);
        n22.right = new TreeNode(2);
        assertFalse(_100_相同的树.isSameTree(n21, n22));

        TreeNode n31 = new TreeNode(1);
        n31.left = new TreeNode(2);
        n31.right = new TreeNode(1);
        TreeNode n32 = new TreeNode(1);
        n32.left = new TreeNode(1);
        n32.right = new TreeNode(2);
        assertFalse(_100_相同的树.isSameTree(n31, n32));
    }

}