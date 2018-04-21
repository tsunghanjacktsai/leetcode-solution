package twopointers;

public class ImplementstrStr {

	public static void main(String[] args) {

		String hayStack = "hello";
		String needle = "ll";
		int result = strStr(hayStack, needle);
		
		System.out.println(result);
	}
	
	public static int strStr(String haystack, String needle) {
		
		if(needle.length() == 0) {
			return 0;
		}
		
		for(int x = 0; x < haystack.length(); x++) {
			if(haystack.charAt(x) == needle.charAt(0) && (x + needle.length()) <= haystack.length()) {
				String temp = haystack.substring(x, x + needle.length());
				if(temp.equals(needle)) {
					return x;
				}
			}
		}
		
		return -1;
	}

}
