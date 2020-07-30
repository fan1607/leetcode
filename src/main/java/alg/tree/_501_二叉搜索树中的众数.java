package alg.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _501_二叉搜索树中的众数 {

    public int[] findMode1(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();
        count(root, counter);
        ArrayList<Integer> values = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                values.clear();
                values.add(entry.getKey());
            } else if (count == maxCount) {
                values.add(entry.getKey());
            }
        }
        int[] res = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            res[i] = values.get(i);
        }
        return res;
    }

    private void count(TreeNode node, Map<Integer, Integer> counter) {
        if (node == null)
            return;
        int count = counter.computeIfAbsent(node.val, key -> 0) + 1;
        counter.put(node.val, count);
        count(node.left, counter);
        count(node.right, counter);
    }

    /**
     * 题解参考：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/solution/marveljian-dan-de-xue-xi-bi-ji-501-by-tyanyonecanc/
     * <br>
     * 关键点：利用BST中序遍历，得到有序的数组
     */
    private LinkedList<Integer> values = new LinkedList<>();
    private int maxCount;
    private int curCount;
    private int curVal;

    public int[] findMode2(TreeNode root) {
        inOrder(root);
        int[] res = new int[values.size()];
        for (int i = 0; i < values.size(); i++)
            res[i] = values.get(i);
        return res;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        if (curVal == node.val) {
            ++curCount;
        } else {
            curVal = node.val;
            curCount = 1;
        }
        if (curCount == maxCount) {
            values.add(curVal);
        } else if (curCount > maxCount) {
            values.clear();
            values.add(curVal);
            maxCount = curCount;
        }
        inOrder(node.right);
    }
}
