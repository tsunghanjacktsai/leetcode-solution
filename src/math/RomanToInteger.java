package math;

public class RomanToInteger {

	public static int romantoInt(String s) {
		String str = s.toUpperCase();
		
		String[] arr = str.split("");
		
		int[] nums = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			switch (arr[i]) {
				case "I":
					nums[i] = 1;
					break;
				case "V":
					nums[i] = 5;
					break;
				case "X":
					nums[i] = 10;
					break;
				case "L":
					nums[i] = 50;
					break;
				case "C":
					nums[i] = 100;
					break;
				case "D":
					nums[i] = 500;
					break;
				case "M":
					nums[i] = 1000;
					break;
				default:
					break;
			}
		}
		int sum = numSum(nums);
		
		return sum;
	}

	public static int numSum(int[] nums) {
		int sum = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {
			
			if(nums[i] < nums[i + 1]) {
				
				sum -= nums[i];
			} else {
				
				sum += nums[i];
			}
		}
		
		int newSum = sum + nums[nums.length - 1];
		
		if(newSum >= 4000) {
			return -1;
		}
		return newSum;
	}
	
	public static void main(String[] args) {

		String s = "cd";
		
		int x = romantoInt(s);
		
		System.out.println(x);
	}
}
