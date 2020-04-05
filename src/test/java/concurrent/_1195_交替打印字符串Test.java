package concurrent;

import org.junit.Test;

public class _1195_交替打印字符串Test {

    @Test
    public void test() throws InterruptedException {
        for (int i = 1; i <= 15; i++)
            new _1195_交替打印字符串(i);
    }

}