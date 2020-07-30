package alg.tree;

import alg.tree.util.TreeUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _501_二叉搜索树中的众数Test {

    @Test
    public void findMode() {
        _501_二叉搜索树中的众数 test = new _501_二叉搜索树中的众数();
        Integer[] values = new Integer[]{1, null, 2, 2};
        TreeNode root = TreeUtil.buildTree(values);
        assertEquals(2, test.findMode1(root)[0]);
        assertEquals(2, test.findMode2(root)[0]);

//        values = new Integer[]{2, 1, 2};
//        root = TreeUtil.buildTree(values);
//        System.out.println(Arrays.toString(test.findMode2(root)));
    }
}