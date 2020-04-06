package alg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _014_最长公共前缀Test {

    @Test
    public void test() {
        _014_最长公共前缀 test = new _014_最长公共前缀();
        assertEquals("fl", test.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", test.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", test.longestCommonPrefix(new String[]{}));
        assertEquals("c", test.longestCommonPrefix(new String[]{"c","c"}));
        assertEquals("a", test.longestCommonPrefix(new String[]{"aa","a"}));
    }

}