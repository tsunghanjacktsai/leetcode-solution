package math;

public class RomanToInteger {

	public static void main(String[] args) {

		String s = "cd";
		
		int x = romantoInt(s);
		
		System.out.println(x);
	}

	public static int romantoInt(String s) {
		//�N�r�Ŧ곣���ন�j�g�r��
		String str = s.toUpperCase();
		
		//�N�r�Ŧ���Ѭ��Ʋ�
		String[] arr = str.split("");
		
		//�Ы� int �����ƲեH��J�����Ʀr
		int[] nums = new int[arr.length];
		
		//�n���U�Ÿ��ҹ����Ʀr
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
		//�p��Ʋդ��U�Ʀr���M
		int sum = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {
			
			if(nums[i] < nums[i + 1]) {
				
				sum -= nums[i];
			} else {
				
				sum += nums[i];
			}
		}
		//�[�W���`���쪺��
		int newSum = sum + nums[nums.length - 1];
		
		//����d�� 1-3999
		if(newSum >= 4000) {
			return -1;
		}
		return newSum;
	}
}
