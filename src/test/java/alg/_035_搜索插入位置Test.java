package alg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _035_搜索插入位置Test {

    @Test
    public void test() {
        assertEquals(1, _035_搜索插入位置.searchInsert(new int[]{1, 3}, 2));
        assertEquals(2, _035_搜索插入位置.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, _035_搜索插入位置.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, _035_搜索插入位置.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, _035_搜索插入位置.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}