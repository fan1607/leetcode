package alg.tree;

public class _剑指Offer_54_二叉搜索树的第k大节点 {

    int k, val; // TODO key：利用成员变量存值

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        traverse(root);
        return val;
    }

    private void traverse(TreeNode root) {
        if (root == null || k == 0)
            return;
        traverse(root.right);
        if (--k == 0) {
            val = root.val;
            return;
        }
        traverse(root.left);
    }
}
