package alg.tree;

public class _100_相同的树 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q == null || p == null && q != null)
            return false;
        if (p == null)
            return true;
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
