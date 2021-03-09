package alg.tree;

import java.util.*;

public class _102_二叉树的层序遍历 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> values;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size(); // key
            values = new ArrayList<>(count);
            TreeNode node;
            for (int i = 0; i < count; i++) {
                node = queue.poll();
                values.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(values);
        }

        return result;
    }

    public List<List<Integer>> levelOrder_2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode node, List<List<Integer>> levelValues, int level) {
        if (node == null)
            return;
        if (levelValues.size() <= level)
            levelValues.add(new LinkedList<>());
        levelValues.get(level).add(node.val);
        dfs(node.left, levelValues, level + 1); // key -> level + 1
        dfs(node.right, levelValues, level + 1);
    }
}
