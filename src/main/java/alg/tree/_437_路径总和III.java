package alg.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _437_路径总和III {

//    public int pathSum(TreeNode root, int sum) {
//        HashMap<TreeNode, List<Integer>> map = new HashMap<>();
//        cal(root, map);
//        int count = 0;
//        for (List<Integer> vals : map.values()) {
//            for (Integer val : vals) {
//                if (val == sum)
//                    ++count;
//            }
//        }
//        return count;
//    }
//
//    private void cal(final TreeNode node, final HashMap<TreeNode, List<Integer>> map) {
//        if (node == null)
//            return;
//        List<Integer> res = new ArrayList<>();
//        res.add(node.val);
//        cal(node.left, map);
//        cal(node.right, map);
//        List<Integer> childRes;
//        if (node.left != null) {
//            childRes = map.get(node.left);
//            for (Integer val : childRes) {
//                res.add(node.val + val);
//            }
//        }
//        if (node.right != null) {
//            childRes = map.get(node.right);
//            for (Integer val : childRes) {
//                res.add(node.val + val);
//            }
//        }
//        map.put(node, res);
//    }

    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        HashMap<TreeNode, List<Integer>> map = new HashMap<>();
        cal(root, sum, map);
        return count;
    }

    private void cal(final TreeNode node, final int sum, final HashMap<TreeNode, List<Integer>> map) {
        if (node == null)
            return;
        List<Integer> res = new LinkedList<>();
        res.add(node.val);
        if (node.val == sum)
            ++count;
        cal(node.left, sum, map);
        cal(node.right, sum, map);
        List<Integer> childRes;
        int s;
        if (node.left != null) {
            childRes = map.remove(node.left);
            for (Integer val : childRes) {
                s = node.val + val;
                res.add(s);
                if (s == sum)
                    ++count;
            }
        }
        if (node.right != null) {
            childRes = map.remove(node.right);
            for (Integer val : childRes) {
                s = node.val + val;
                res.add(s);
                if (s == sum)
                    ++count;
            }
        }
        map.put(node, res);
    }

    // TODO 看题解提到前缀和
}
