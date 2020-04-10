package alg.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class _100_相同的树Test {

    @Test
    public void test() {
        _100_相同的树.TreeNode n11 = new _100_相同的树.TreeNode(1);
        n11.left = new _100_相同的树.TreeNode(2);
        n11.right = new _100_相同的树.TreeNode(3);
        _100_相同的树.TreeNode n12 = new _100_相同的树.TreeNode(1);
        n12.left = new _100_相同的树.TreeNode(2);
        n12.right = new _100_相同的树.TreeNode(3);
        assertTrue(_100_相同的树.isSameTree(n11, n12));

        _100_相同的树.TreeNode n21 = new _100_相同的树.TreeNode(1);
        n21.left = new _100_相同的树.TreeNode(2);
        _100_相同的树.TreeNode n22 = new _100_相同的树.TreeNode(1);
        n22.right = new _100_相同的树.TreeNode(2);
        assertFalse(_100_相同的树.isSameTree(n21, n22));

        _100_相同的树.TreeNode n31 = new _100_相同的树.TreeNode(1);
        n31.left = new _100_相同的树.TreeNode(2);
        n31.right = new _100_相同的树.TreeNode(1);
        _100_相同的树.TreeNode n32 = new _100_相同的树.TreeNode(1);
        n32.left = new _100_相同的树.TreeNode(1);
        n32.right = new _100_相同的树.TreeNode(2);
        assertFalse(_100_相同的树.isSameTree(n31, n32));
    }

}