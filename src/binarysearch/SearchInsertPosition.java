package binarysearch;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = {1, 3, 5, 7};
		int target = 6;
		int result = searchInsert(nums, target);
		
		System.out.println(result);
	}
	
	public static int searchInsert(int[] nums, int target) {
		int result = 0;
		
		for(int x = 0; x < nums.length; x++) {
			if(target == nums[x]) {
				result = x;
			} else if(target > nums[x]) {
				result = x + 1;
			} else {
				return result;
			}
		}
		return result;
	}
}
