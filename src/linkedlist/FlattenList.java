package linkedlist;

public class FlattenList {
    private class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int val, Node prev, Node next, Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }

    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node p = head;
        while (p != null) {
            // No child node
            if (p.child == null) {
                p = p.next;
                continue;
            }
            // Got child, find the tail of the child and link it to p.next
            Node tail = p.child;
            // Find the tail of the child
            while (tail.next != null) {
                tail = tail.next;
            }
            // Connect tail with p.next
            tail.next = p.next;
            if (p.next != null) {
                p.next.prev = tail;
            }
            // Connect p with p.child, and remove p.child
            p.next = p.child;
            p.child.prev = p;
            p.child = null;
        }
        return head;
    }
}
