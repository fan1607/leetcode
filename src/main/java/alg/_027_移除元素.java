package alg;

public class _027_移除元素 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1)
            return nums[0] == val ? 0 : 1;
        int i = 0, j = nums.length - 1, tem;
        while (i < j) {
            while (nums[i] != val && i < j)
                ++i;
            while (nums[j] == val && j > i)
                --j;
            if (i < j) {
                tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
            } else if (i == nums.length - 1 && nums[i] != val) {
                ++i;
            }
        }
        return i;
    }

    public int removeElement_answer(int[] nums, int val) {
        int newSize = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[newSize++] = nums[i];
            }
        }
        return newSize;
    }
}
