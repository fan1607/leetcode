package alg.tree.util;

import alg.tree.TreeNode;

import java.util.LinkedList;

public class TreeUtil {

    public static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0)
            return null;
        TreeNode[] nodes = new TreeNode[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null)
                continue;
            nodes[i] = new TreeNode(values[i]);
        }

        int pIdx = 0, cIdx = 0;
        while (pIdx < nodes.length) {
            if (nodes[pIdx] == null) {
                ++pIdx;
                continue;
            }
            if (++cIdx >= nodes.length)
                break;
            nodes[pIdx].left = nodes[cIdx];
            if (++cIdx >= nodes.length)
                break;
            nodes[pIdx].right = nodes[cIdx];
            ++pIdx;
        }

        return nodes[0];
    }

    public static void print(TreeNode root) {
        LinkedList<TreeNode> traverses = new LinkedList<>();
        print(root, traverses);
    }

    private static void print(TreeNode node, LinkedList<TreeNode> traverses) {
        if (node != null) {
            System.out.print(node.val + " ");
            traverses.add(node.left);
            traverses.add(node.right);
        } else {
            System.out.print("null ");
        }
        if (!traverses.isEmpty()) {
            print(traverses.pollFirst(), traverses);
        }
    }

    public static void main(String[] args) {
        Integer[] values = new Integer[]{90, 69, null, 49, 89, null, 52, null, null, null, null};
        TreeNode root = buildTree(values);
        print(root);
    }
}
