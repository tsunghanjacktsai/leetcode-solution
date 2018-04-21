package array;

public class RemoveDuplicatesFromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		int count = 0;
		for(int x = 1; x < nums.length; x++) {
			if(nums[x] != nums[x - 1]) {
				nums[++count] = nums[x];
			}
		}
		int result = count + 1;
		return result;
	}
}
