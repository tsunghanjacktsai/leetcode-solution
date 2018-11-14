package linkedlist;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd != null && even != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }

    public ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null ||
                head.next.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode odd = oddHead;
        head = head.next;
        ListNode evenHead = head;
        ListNode even = evenHead;
        head = head.next;
        boolean bool = false;

        while (head != null) {
            if (bool == false) {
                odd.next = head;
                odd = odd.next;
                head = head.next;
                bool = true;
            } else {
                even.next = head;
                even = even.next;
                head = head.next;
                bool = true;
            }
        }
        odd.next = evenHead;
        even.next = null;
        return oddHead;
    }
}
