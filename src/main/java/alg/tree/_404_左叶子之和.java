package alg.tree;

public class _404_左叶子之和 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        TreeNode left = root.left;
        if (left != null && left.left == null && left.right == null)
            return left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
