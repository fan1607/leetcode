package alg;

import java.util.HashMap;

public class _001_两数之和 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return null;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] != target)
                    continue;
                return new int[]{i, j};
            }
        }
        return null;
    }

    public int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer idx;
        for (int i = 0; i < nums.length; i++) {
            if ((idx = map.get(target - nums[i])) != null)
                return new int[]{idx, i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
