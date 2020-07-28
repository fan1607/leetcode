package alg.tree;

public class _剑指Offer55_I_二叉树的深度 {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
