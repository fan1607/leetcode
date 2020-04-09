package alg;

public class _024_两两交换链表中的节点 {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        int i = 0;
        ListNode cur = head, next, tmp, last = null;
        while (cur != null) {
            if (i % 2 == 0) {
                next = cur.next;
                if (next == null)
                    break;
                tmp = next.next;
                next.next = cur;
                cur.next = tmp;
                if (last != null)
                    last.next = next;
                last = cur;
                cur = cur.next;
                if (i == 0)
                    head = next;
            }
            ++i;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
