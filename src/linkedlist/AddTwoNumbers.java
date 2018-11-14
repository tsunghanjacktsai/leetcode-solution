package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0; // 進位
        int sum;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            l3.next = cur;
            l3 = l3.next;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}
