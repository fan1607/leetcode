package alg;

public class _035_搜索插入位置 {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        if (target <= nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length;
        int low = 0, high = nums.length - 1, i = 0;
        while (low < nums.length - 1 || high > 0) {
            i = (low + high) / 2;
            if (target < nums[i]) {
                high = i;
            } else if (target > nums[i]) {
                if (low == i)
                    return ++i;
                low = i;
            } else {
                return i;
            }
        }
        return i;
    }

    public static int searchInsert2(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (target <= nums[i])
                break;
        }
        return i;
    }
}
