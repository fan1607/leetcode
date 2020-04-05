package alg;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _026_删除排序数组中的重复项Test {

    @Test
    public void test() {
        _026_删除排序数组中的重复项 test = new _026_删除排序数组中的重复项();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(test.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}