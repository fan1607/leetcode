package alg.tree;

import java.util.LinkedList;
import java.util.List;

public class _590_N叉树的后序遍历 {

    private class Node {
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

    public List<Integer> postorder(Node root) {
        List<Integer> results = new LinkedList<>();
        doLRD(root, results);
        return results;
    }

    private void doLRD(Node node, List<Integer> results) {
        if (node == null)
            return;
        if (node.children != null && node.children.size() > 0) {
            for (Node child : node.children) {
                doLRD(child, results);
            }
        }
        results.add(node.val);
    }
}
