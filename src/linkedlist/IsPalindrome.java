package linkedlist;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null || fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseHead = reverse(slow.next);
        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode next = null;
        while (head.next != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return head;
    }
}
