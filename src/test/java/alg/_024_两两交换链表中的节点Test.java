package alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class _024_两两交换链表中的节点Test {

    @Test
    public void test() {
        _024_两两交换链表中的节点.ListNode n1 = new _024_两两交换链表中的节点.ListNode(1);
        _024_两两交换链表中的节点.ListNode n2 = new _024_两两交换链表中的节点.ListNode(2);
        _024_两两交换链表中的节点.ListNode n3 = new _024_两两交换链表中的节点.ListNode(3);
        _024_两两交换链表中的节点.ListNode n4 = new _024_两两交换链表中的节点.ListNode(4);
        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;

        print(_024_两两交换链表中的节点.swapPairs(n1));
    }

    private void print(_024_两两交换链表中的节点.ListNode node) {
        while (node != null) {
            System.out.print(node.val + "-");
            node = node.next;
        }
        System.out.println();
    }
}