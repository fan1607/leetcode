package alg;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _007_整数反转Test {

    private _007_整数反转 obj;

    @Before
    public void init() {
        obj = new _007_整数反转();
    }

    @Test
    public void test() {
        assertEquals(123, obj.reverse2(321));
        assertEquals(-123, obj.reverse2(-321));
        System.out.println(obj.reverse2(Integer.MIN_VALUE));
        System.out.println(obj.reverse2(Integer.MAX_VALUE));
        System.out.println(obj.reverse2(1534236469));
    }
}