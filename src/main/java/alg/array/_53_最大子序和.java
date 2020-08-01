package alg.array;

public class _53_最大子序和 {

    /**
     * <p>DP题解</p>
     * 参考：https://leetcode-cn.com/problems/maximum-subarray/solution/huan-mei-you-nong-dong-jiu-kan-zhe-yi-pian-ti-jie-/
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = nums[0];
        int subMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (subMax > 0) {
                subMax += nums[i];
            } else {
                subMax = nums[i];
            }
            max = Math.max(max, subMax);
        }
        return max;
    }
}
