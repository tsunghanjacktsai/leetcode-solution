package linkedlist;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) { // Head is null or only one node
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }

            if (fast == null) { // Two nodes
                return false;
            }

            if (slow == fast) { // To prevent fast.val -> null pointer exception
                return true;
            }
        }
    }
}
