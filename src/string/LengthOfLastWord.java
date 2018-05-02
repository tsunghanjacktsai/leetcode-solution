package string;

public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		int length = str.length() - str.lastIndexOf(' ') - 1;
		return length;
	}
	
	public static void main(String[] args) {
		String input = "Hello World";
		int result = lengthOfLastWord(input);
		
		System.out.println(result);
	}
}
