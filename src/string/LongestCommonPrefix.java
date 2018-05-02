package string;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		
		int max = 0;
		int pos_max = 0;
		for (int x = 0; x < strs.length; x++) {
			
			if(strs[x].length() > max) {
				max = strs[x].length();
				pos_max = x;
			}
		}
		
		String it = strs[pos_max];
		for (int i = max; i >= 0; i--) {
			String substring = it.substring(0, i);
			boolean found = true;
			for (String str : strs) {
				if (str.length() < substring.length() || !(str.substring(0, i).equals(substring))) {
					found = false;
					break;
				}
			}
			if (found) {
				return substring;
			}
		}
		return "";
	}
	
	public static void main(String[] args) {

		String[] arr = { "abd", "abc", "abb" };
		String s = longestCommonPrefix(arr);

		System.out.println(s);
	}
}
