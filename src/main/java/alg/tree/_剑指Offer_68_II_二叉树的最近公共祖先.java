package alg.tree;

public class _剑指Offer_68_II_二叉树的最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        // TODO l、r 非空时，说明 p、q 分居 root 的两侧，root 就是 LCA
        if (l != null && r != null)
            return root;
        // TODO l、r 任一为空，说明 LCA 位于另一子树或其祖先中
        return l == null ? r : l;
    }

    // TODO 其他思路：
    //  遍历整棵树，HashMap存储各节点的祖先映射；
    //  用数据结构存储节点 p 向上查找的所有祖先；
    //  向上查找节点 q 的祖先，是已访问过的则说明是 LCA

    // TODO DFS
}
