package string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String input = "Hello World";
		int result = lengthOfLastWord(input);
		
		System.out.println(result);
	}
	
	public static int lengthOfLastWord(String s) {
		//�N�r�Ŧ��Y����ݪ��Ů�h��
		String str = s.trim();
		//�r�Ŧ���״�h�Ů�̫�X�{���a��Y���̫���������
		int length = str.length() - str.lastIndexOf(' ') - 1;
		return length;
	}
}
