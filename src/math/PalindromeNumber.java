package math;

public class PalindromeNumber {

	public static void main(String[] args) {

		int x = 101;
		
		boolean b = isPalindrome(x);
		boolean b2 = isPalindrome_2(x);
		
		System.out.println(b);
		System.out.println(b2);
	}
	
	public static boolean isPalindrome(int x) {
		
		String str = Integer.toString(x);
		String[] arr = str.split("");
		String[] newArr  = swap(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < newArr.length; i++) {
			
			sb.append(newArr[i]);
		}
		
		String result = sb.toString().substring(0, sb.toString().length());
		
		try {
			Integer.parseInt(result);
		} catch (NumberFormatException e) {
			return false;
		}
		
		for(int i = 0; i < newArr.length; i++) {
			
			if(!(newArr[i].equals(arr[i]))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome_2(int x) {
		if (x<0 || (x!=0 && x%10==0)) 
			return false;
		
		//x = 101
	    int num = 0;
	    while (x > num){
	    	num = num * 10 + x % 10;//num = 1 //10
	    	x = x / 10;//10 //1
	    }
	    return (x == num || x == num/10);
	}

	public static String[] swap(String[] arr) {
		String[] newArr = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			newArr[i] = arr[arr.length - i - 1];
		}
		return newArr;
	}
}
