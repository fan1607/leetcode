package alg.tree;

public class _783_二叉搜索树节点最小距离 {

    private Integer preVal = null;
    private int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    /**
     * 利用BST特性，中序遍历得到升序排列，比较当前最小值与相邻两个节点差值
     */
    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        if (preVal != null) {
            min = Math.min(min, node.val - preVal);
        }
        preVal = node.val;
        inOrder(node.right);
    }

}
