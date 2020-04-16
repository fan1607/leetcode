package alg.tree;

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

//    private int count = 0;
//
//    public int pathSum(TreeNode root, int sum) {
//        HashMap<TreeNode, List<Integer>> map = new HashMap<>();
//        cal(root, sum, map);
//        return count;
//    }
//
//    private void cal(final TreeNode node, final int sum, final HashMap<TreeNode, List<Integer>> map) {
//        if (node == null)
//            return;
//        List<Integer> res = new LinkedList<>();
//        res.add(node.val);
//        if (node.val == sum)
//            ++count;
//        cal(node.left, sum, map);
//        cal(node.right, sum, map);
//        List<Integer> childRes;
//        int s;
//        if (node.left != null) {
//            childRes = map.remove(node.left);
//            for (Integer val : childRes) {
//                s = node.val + val;
//                res.add(s);
//                if (s == sum)
//                    ++count;
//            }
//        }
//        if (node.right != null) {
//            childRes = map.remove(node.right);
//            for (Integer val : childRes) {
//                s = node.val + val;
//                res.add(s);
//                if (s == sum)
//                    ++count;
//            }
//        }
//        map.put(node, res);
//    }

    private int count = 0;

    public int pathSum(TreeNode root, int sum) {
        cal(root, sum);
        return count;
    }

    private int[] cal(final TreeNode node, final int sum) {
        if (node == null)
            return null;
        int[] lc = cal(node.left, sum);
        int[] rc = cal(node.right, sum);
        if (node.val == sum)
            ++count;
        int[] res = new int[1 + (lc == null ? 0 : lc.length) + (rc == null ? 0 : rc.length)];
        res[0] = node.val;
        int i = 1;
        if (lc != null) {
            for (int val : lc) {
                res[i] = node.val + val;
                if (res[i++] == sum)
                    ++count;
            }
        }
        if (rc != null) {
            for (int val : rc) {
                res[i] = node.val + val;
                if (res[i++] == sum)
                    ++count;
            }
        }
        return res;
    }

    // TODO 看题解提到前缀和
}
