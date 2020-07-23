package alg.tree.util;

import alg.tree.TreeNode;

public class BuildTreeUtil {

    public static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0)
            return null;
        TreeNode[] nodes = new TreeNode[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null)
                continue;
            nodes[i] = new TreeNode(values[i]);
        }
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] == null)
                continue;
            if (2 * i + 1 >= nodes.length)
                break;
            nodes[i].left = nodes[2 * i + 1];
            if (2 * i + 2 >= nodes.length)
                break;
            nodes[i].right = nodes[2 * i + 2];
        }
        return nodes[0];
    }
}
