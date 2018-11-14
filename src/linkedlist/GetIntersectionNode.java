package linkedlist;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode curA = headA;
        ListNode curB = headB;

        // Get length
        int lengthA = 0;
        int lengthB = 0;
        while (curA.next != null || curB.next != null) {
            if (curA.next != null) {
                curA = curA.next;
                ++lengthA;
            }

            if (curB.next != null) {
                curB = curB.next;
                ++lengthB;
            }
        }

        curA = headA;
        curB = headB;

        int diff = lengthA >= lengthB ? lengthA - lengthB : lengthB - lengthA;
        for (int i = 0; i < diff; i++) {
            if (lengthA >= lengthB) {
                curA = curA.next;
            } else {
                curB = curB.next;
            }
        }

        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }

        return curA;
    }
}
