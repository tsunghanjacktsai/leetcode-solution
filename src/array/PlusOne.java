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
			//�p�G�Ʀr�p�� 9 �h�V�W�[ 1
			if(digits[x] < 9) {
				digits[x]++;
				return digits;
			}
			//�j�� 9 �h�Ʋդ������� 0
			digits[x] = 0;
		}
		//�p�G�Ʋդ������� 0 �h�Ыطs���׼Ʋըöi��
		int[] nums = new int[digits.length + 1];
		nums[0] = 1;
		
		return nums;
	}
}
