package alg.tree;

import java.util.HashMap;

public class _剑指Offer55_II_平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(height(root.left) - height(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * <p>缓存树的各节点高度，避免重复求解 ----> 结果反而更慢，可能原因：</p>
     * <ul>
     * <li>树太小，求节点高度比HashMap的get、set操作耗时更少</li>
     * <li>树比较大，HashMap扩容rehash等耗时</li>
     * </ul>
     */
    private HashMap<TreeNode, Integer> heightCache = new HashMap<>();

    public boolean isBalanced2(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(height2(root.left) - height2(root.right)) > 1)
            return false;
        return isBalanced2(root.left) && isBalanced2(root.right);
    }

    private int height2(TreeNode node) {
        Integer height = heightCache.get(node);
        if (height == null) {
            height = node == null ? 0 : 1 + Math.max(height2(node.left), height2(node.right));
            heightCache.put(node, height);
        }
        return height;
    }
}
