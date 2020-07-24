package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class _257_二叉树的所有路径 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        buildPath(root, "", result);
        return result;
    }

    private void buildPath(TreeNode node, String path, List<String> result) {
        if (node == null)
            return;
        path += node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            buildPath(node.left, path, result);
            buildPath(node.right, path, result);
        }
    }
}
