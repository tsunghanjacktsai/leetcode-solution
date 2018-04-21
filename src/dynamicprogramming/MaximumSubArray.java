package dynamicprogramming;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,-2,-1,-5,-4};
		int result = maxSubArray(arr);
		System.out.println(result);
	}
	
	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int x = 0; x < nums.length; x++) {
			//�p�G�ۥ[�᪺�Ʀr�p�� 0�A�h��^���Ʀr�ç@�������V�W�֥[�A�p�G���p�� 0�A�h�~��֥[
			sum = sum < 0 ? sum = nums[x] : sum + nums[x];
			//����ño�X�̤j��
			max = Math.max(max, sum);
		}
		
		return max;
	}
	
	public static int maxSubArray_2(int[] nums) {
		int soFar = nums[0]; 
		int max = nums[0];
		
		for(int x = 1; x < nums.length; ++x) {
			max = Math.max(max + nums[x], nums[x]);
			soFar = Math.max(max, soFar);
		}
		
		return soFar;
	}
}