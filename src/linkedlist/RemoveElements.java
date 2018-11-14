package linkedlist;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        while (head.next != null && head.val == val) {
            head = head.next;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
