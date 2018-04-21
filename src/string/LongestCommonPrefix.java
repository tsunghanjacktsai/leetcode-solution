package string;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] arr = { "abd", "abc", "abb" };
		String s = longestCommonPrefix(arr);

		System.out.println(s);
	}

	public static String longestCommonPrefix(String[] strs) {
		//�p�G�Ʋլ��ūh��^�ŭ�
		if (strs.length == 0) {
			return "";
		}
		
		//�P�_�̪��r�Ŧ���שM��Ҧb��m
		int max = 0;
		int pos_max = 0;
		for (int x = 0; x < strs.length; x++) {
			
			if(strs[x].length() > max) {
				max = strs[x].length();
				pos_max = x;
			}
		}
		
		//�Ѫ��r�Ŧꪺ�r�ųv�@�Y�p�d��d�򪽨���۲ūe��r����
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
}
