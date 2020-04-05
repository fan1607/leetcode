package alg;

import alg._020_有效的括号;
import org.junit.Test;

import static org.junit.Assert.*;

public class _020_有效的括号Test {

    @Test
    public void test() {
        _020_有效的括号 test = new _020_有效的括号();
        assertTrue(test.isValid("()"));
        assertTrue(test.isValid("()[]{}"));
        assertTrue(test.isValid("{[]}"));

        assertFalse(test.isValid("{{)}"));
        assertFalse(test.isValid("(("));
        assertFalse(test.isValid("(]"));
        assertFalse(test.isValid("([)]"));
    }

}