package alg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _027_移除元素Test {

    @Test
    public void test() {
        _027_移除元素 test = new _027_移除元素();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, test.removeElement(nums, 2));

        nums = new int[]{3, 2, 2, 3};
        assertEquals(2, test.removeElement(nums, 3));

        nums = new int[]{2};
        assertEquals(1, test.removeElement(nums, 3));

        nums = new int[]{3, 3};
        assertEquals(2, test.removeElement(nums, 5));

        nums = new int[]{4, 5};
        System.out.println(test.removeElement(nums, 4));
    }

}