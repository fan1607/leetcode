package alg.tree;

import java.util.Stack;

public class _938_二叉搜索树的范围和 {

    public int rangeSumBST(TreeNode root, int L, int R) {
        return dfs(root, L, R);
    }

    /**
     * 递归深度优先遍历
     */
    private int dfs(TreeNode node, int L, int R) {
        if (node == null)
            return 0;
        if (node.val < L)
            return dfs(node.right, L, R);
        if (node.val > R)
            return dfs(node.left, L, R);
        return node.val + dfs(node.left, L, R) + dfs(node.right, L, R);
    }

    /**
     * 迭代深度优先遍历（DFS用栈，BFS用队列）
     */
    public int rangeSumBST2(TreeNode root, int L, int R) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root == null)
                continue;
            if (root.val < L) {
                stack.push(root.right);
            } else if (root.val > R) {
                stack.push(root.left);
            } else {
                sum += root.val;
                stack.push(root.left);
                stack.push(root.right);
            }
        }
        return sum;
    }
}
