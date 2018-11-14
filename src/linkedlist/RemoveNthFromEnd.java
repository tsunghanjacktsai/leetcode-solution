package linkedlist;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) { // One node
            head = head.next;
            return head;
        }
        if (head == null) { // No node
            return head;
        }

        ListNode cur = head;
        int length = 1;
        while (cur.next != null) {
            cur = cur.next;
            length++;
        }
        cur = head;

        ListNode prev = head;
        int diff = length - n;
        if (diff == 0) { // Delete the head node
            cur = cur.next;
            head = head.next;
        }
        for (int i = 0; i < diff; i++) {
            cur = cur.next;
        }
        while (prev.next != cur) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        if (prev.next == null) { // Two nodes
            return head;
        }

        return head;
    }
}
