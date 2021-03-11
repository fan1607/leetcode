package alg.tree;

public class _235_二叉搜索树的最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO key -> 二叉搜索树的性质
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }

//    private HashSet<TreeNode> ancestors = new HashSet<>();
//    private TreeNode lowestAncestor = null;
//
//    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
//        findPosition(root, p, false);
//        findPosition(root, q, true);
//        return lowestAncestor;
//    }
//
//    private void findPosition(TreeNode root, TreeNode target, boolean match) {
//        if (root == null)
//            return;
//        if (match) {
//            if (ancestors.contains(root)) {
//                lowestAncestor = root;
//            } else {
//                return;
//            }
//        } else {
//            ancestors.add(root);
//        }
//        if (root.val > target.val)
//            findPosition(root.left, target, match);
//        else if (root.val < target.val)
//            findPosition(root.right, target, match);
//    }
}
