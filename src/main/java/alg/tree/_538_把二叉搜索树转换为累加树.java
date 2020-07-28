package alg.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _538_把二叉搜索树转换为累加树 {

    public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        Queue<Integer> queue = new LinkedList<>();
        traverse(root, queue);
        return root;
    }

    private void traverse(TreeNode node, Queue<Integer> queue) {
        if (node == null)
            return;
        traverse(node.right, queue);
        if (queue.size() > 0) {
            node.val += queue.remove();
        }
        queue.add(node.val);
        traverse(node.left, queue);
    }


    private int sum = 0;

    public TreeNode convertBST2(TreeNode root) {
        if (root == null)
            return null;
        traverse2(root);
        return root;
    }

    private void traverse2(TreeNode node) {
        if (node == null)
            return;
        traverse2(node.right);
        sum += node.val;
        node.val = sum;
        traverse2(node.left);
    }
}
