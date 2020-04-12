package alg.tree;

public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root);
    }

    private int findMaxDepth(TreeNode t) {
        if (t == null)
            return 0;
        return 1 + Math.max(findMaxDepth(t.left), findMaxDepth(t.right));
    }
}
