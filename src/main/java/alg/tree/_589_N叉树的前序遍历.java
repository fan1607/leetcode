package alg.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _589_N叉树的前序遍历 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder1(Node root) {
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        LinkedList<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            res.add(node.val);
            List<Node> children = node.children;
            if (children != null && children.size() > 0) {
                children.forEach(stack::push);
                while (!stack.isEmpty()) {
                    queue.addFirst(stack.pop());
                }
            }
        }
        return res;
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if (root != null)
            preOrder(root, res);
        return res;
    }

    private void preOrder(Node root, List<Integer> res) {
        if (root == null)
            return;
        res.add(root.val);
        if (root.children != null) {
            root.children.forEach(node -> preOrder(node, res));
        }
    }

}
