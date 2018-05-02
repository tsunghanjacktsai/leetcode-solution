package string;

public class CountAndSay {
	
	public static String countAndSay(int n) {
		if(n < 1) {
			return "";
		}
		
		String str = "1";
		for(int x = 2; x <= n; x++) {
			str = countAndSay(str);
		}
		
		return str;
	}

	public static String countAndSay(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;

		for(int x = 1; x < str.length(); x++) {
			if(str.charAt(x) == str.charAt(x - 1)) {
				count++;
			} else {
				sb.append(count);
				sb.append(str.charAt(x - 1));
				count = 1;
				continue;
			}
		}
		
		sb.append(count);
		sb.append(str.charAt(str.length() - 1));
		
		return sb.toString();
	}
	
	public static void main(String[] args) {

		int n = 1;
		String output = countAndSay(n);
		
		System.out.println(output);
	}
}
