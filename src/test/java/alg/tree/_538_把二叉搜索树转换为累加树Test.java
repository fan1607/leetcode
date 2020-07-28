package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

public class _538_把二叉搜索树转换为累加树Test {

    @Test
    public void convertBST() {
        Integer[] values = new Integer[]{5, 2, 13};
        TreeNode root = TreeUtil.buildTree(values);
        _538_把二叉搜索树转换为累加树 test = new _538_把二叉搜索树转换为累加树();
        TreeUtil.print(test.convertBST(root));
    }
}