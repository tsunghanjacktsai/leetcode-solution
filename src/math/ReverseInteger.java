package math;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = -2147483648;
		int reverseNum = reverse(x);
		int reverseNum_2 = reverse_2(x);
		
		System.out.println(reverseNum);
		System.out.println(reverseNum_2);
		
	}
	
	public static int reverse(int x) {
		
		int num = Math.abs(x);
		String str = Integer.toString(num);
		String[] arr = str.split("");
		
		String[] newArr = swap(arr);	
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < newArr.length; i++) {
			
			sb.append(newArr[i]);
		}
		
		String result = sb.toString().substring(0, sb.toString().length());
		
		try {
			
			return x > 0 ? Integer.parseInt(result) : -Integer.parseInt(result);
		} catch (NumberFormatException e) {

			return 0;
		}
	}
	
	public static int reverse_2(int x) {
		//123
		int result = 0;
		
		while(x != 0) {

			int tail = x % 10;//3//2//1
			int newRes = result * 10 + tail;//3//32//321
			
			if((newRes - tail) / 10 != result) {
				return 0;
			} else {
				result = newRes;//result = 321
			}
			x = x / 10;//12//1//0 -> break;		
		}		
		return result;//321
	}

	public static String[] swap(String[] arr) {

		String[] newArr = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			newArr[i] = arr[arr.length - i - 1];
		}
		return newArr;
	}
}
