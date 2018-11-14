package linkedlist;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class SinglyLinkedList {
    Node head;
    int size;

    /**
     * Initialize your data structure here.
     */
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node cur = head;
        int j = 0;
        while (j < index) {
            cur = cur.next;
            j++;
        }
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node cur = new Node(val);
        cur.next = head;
        head = cur;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node prev = head;
        while (prev.next != null) { // Find the last node
            prev = prev.next;
        }
        prev.next = new Node(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index <= size) {
            Node cur = new Node(val);

            int count = 1;
            // Create a reference to the node just before the insertion point
            Node prev = head;
            while (prev.next != null && count < index) {
                prev = prev.next;
                count++;
            }

            // Insert the node
            cur.next = prev.next;
            prev.next = cur;

            // Increment list size
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (checkIndex(index)) {
            // Delete at head
            if (index == 0) {
                head = head.next;
            } else { // Traverse the list to find deletion point
                int count = 1;

                // Create a reference to the node just before the deletion point
                Node prev = head;
                while (prev.next != null && count < index) {
                    prev = prev.next;
                    count++;
                }

                // Change references to skip over the deletion point
                prev.next = prev.next.next;
            }
            // Decrement the size
            size--;
        }
    }

    public boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.get(0));
        list.addAtIndex(1, 2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.addAtIndex(0, 1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
