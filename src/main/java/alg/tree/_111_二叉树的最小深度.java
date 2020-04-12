package alg.tree;

public class _111_二叉树的最小深度 {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        if (root.left == null || root.right == null)
            return m1 + m2 + 1;
        return 1 + Math.min(m1, m2);
    }
}
