import java.util.Stack;

public class _020_有效的括号 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty() || Math.abs(c - stack.pop()) > 2) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
