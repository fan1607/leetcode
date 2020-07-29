package alg.tree;

public class _1022_从根到叶的二进制数之和 {

    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        traverse(root, 0);
        return sum;
    }

    private void traverse(TreeNode node, int pSum) {
        if (node == null)
            return;
        pSum = pSum * 2 + node.val;
        if (node.left == null && node.right == null) {
            sum += pSum;
            return;
        }
        traverse(node.left, pSum);
        traverse(node.right, pSum);
    }

    public int sumRootToLeaf2(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum = sum * 2 + root.val;
        if (root.left == null && root.right == null)
            return sum;
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
