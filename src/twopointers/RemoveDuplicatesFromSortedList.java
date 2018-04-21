package twopointers;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next.val = 2;
		list.next.val = 2;
		list.next.val = 3;
		
		while(list != null) {
			System.out.print(list.val + ",");
			list = list.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode list = head;
		
		while(list != null) {
			if(list.next == null) {
				break;
			}
			if(list.val == list.next.val) {
				list.next = list.next.next;
			} else {
				list = list.next;
			}
		}
		return head;
	}
}
