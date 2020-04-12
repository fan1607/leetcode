package alg;

import org.junit.Test;

import static org.junit.Assert.*;


public class _028_实现strStrTest {

    @Test
    public void test() {
        assertEquals(4, _028_实现strStr.strStr("aabaaabaaac", "aabaaac"));
        assertEquals(-1, _028_实现strStr.strStr("aaaaa", "bba"));
        assertEquals(0, _028_实现strStr.strStr("a", "a"));
        assertEquals(0, _028_实现strStr.strStr("hello", ""));
        assertEquals(2, _028_实现strStr.strStr("hello", "ll"));
        assertEquals(-1, _028_实现strStr.strStr("hello", "lll"));
        assertEquals(-1, _028_实现strStr.strStr("mississippi", "issipi"));
    }
}