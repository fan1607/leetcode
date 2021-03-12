package alg.list;

public class _剑指Offer_24_反转链表 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode n1 = head, n2 = head.next, temp;
        n1.next = null; // TODO 注意：需要将反转后最后一个节点的next设置为null，否则会产生环
        while (n2 != null) {
            temp = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = temp;
        }
        return n1; // TODO 此时n2==null
    }

    // 递归解法
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null)
            return head;
        return recur(head, null); // 喵啊null
    }

    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null)
            return pre; // 头结点
        ListNode rec = recur(cur.next, cur);
        cur.next = pre; // 反转
        return rec;
    }
}
