package alg;

public class _026_删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (++j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }
}
