package alg;

import java.util.Stack;

public class _剑指Offer_09_用两个栈实现队列 {

    static class CQueue {

        // TODO 题目要求用两个栈，看速度快的题解用的Deqeue，甚至用数据？
        private Stack<Integer> out, in;

        public CQueue() {
            out = new Stack<>();
            in = new Stack<>();
        }

        public void appendTail(int value) {
            // TODO key -> 不用将out先导回in
            in.add(value);
        }

        public int deleteHead() {
            if (out.isEmpty()) {
                // TODO 类似批量拉取的效果
                while (!in.isEmpty()) {
                    out.add(in.pop());
                }
            }
            return out.isEmpty() ? -1 : out.pop();
        }
    }
}
