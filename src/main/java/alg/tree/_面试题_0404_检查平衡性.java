package alg.tree;

public class _面试题_0404_检查平衡性 {

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        if (Math.abs(lHeight - rHeight) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
