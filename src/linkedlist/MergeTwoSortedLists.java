package linkedlist;

public class MergeTwoSortedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) {
			
			return l1;
		}
		ListNode l3 = new ListNode(-1);
		ListNode result = l3;
		
		while(l1 != null && l2 != null) {
			
			if(l1.val == l2.val) {
				
				l3.next = l1;
				l1 = l1.next;
				l3 = l3.next;
				l3.next = l2;
				l2 = l2.next;
			} else if(l1.val > l2.val) {
				
				l3.next = l2;
				l2 = l2.next;
			} else {
				
				l3.next = l1;
				l1 = l1.next;
			}
			
			l3 = l3.next;
		}
		
		if(l1 == null) {
			
			l3.next = l2;
		} else {
			
			l3.next = l1;
		}
		
		return result.next;
	}
}
