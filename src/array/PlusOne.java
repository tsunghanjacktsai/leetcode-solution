package array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {10};
		int[] nums = plusOne(digits);
		System.out.println(Arrays.toString(nums));
	}
	
	public static int[] plusOne(int[] digits) {
		for(int x = digits.length - 1; x >= 0; x--) {
			if(digits[x] < 9) {
				digits[x]++;
				return digits;
			}
			digits[x] = 0;
		}
		int[] nums = new int[digits.length + 1];
		nums[0] = 1;
		
		return nums;
	}
}
