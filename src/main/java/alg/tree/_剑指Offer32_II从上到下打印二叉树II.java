package alg.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _剑指Offer32_II从上到下打印二叉树II {

    /**
     * 题解参考：https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/die-dai-di-gui-duo-tu-yan-shi-102er-cha-shu-de-cen/
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            int size = queue.size();    // 使用size来分层分割BFS
            ArrayList<Integer> values = new ArrayList<>(size);  // 指定大小避免扩容
            while (size-- > 0) {
                TreeNode node = queue.remove();
                values.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(values);
        }
        return res;
    }

    /**
     * 更快内存消耗更少（不用维护queue）
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode node, List<List<Integer>> res, int level) {
        if (node == null)
            return;
        if (res.size() <= level)    // 注意level从0开始计算
            res.add(new LinkedList<>());
        res.get(level).add(node.val);   // ArrayList索引get更快
        // 末尾add操作ArrayList和LinkedList差别不大，此处考虑ArrayList有默认初始化大小（10）以及add可能要扩容而选LinkedList
        dfs(node.left, res, level + 1);
        dfs(node.right, res, level + 1);
    }
}
