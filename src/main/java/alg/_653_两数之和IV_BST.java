package alg;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class _653_两数之和IV_BST {

    /**
     * BFS + set
     */
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode node;
        while ((node = queue.poll()) != null) {
            if (set.contains(k - node.val))
                return true;
            set.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return false;
    }

    public boolean findTarget2(TreeNode root, int k) {
        return find(root, k, new HashSet<Integer>());
    }

    private boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
