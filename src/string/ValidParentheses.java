package string;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "[()]";
		boolean b = isValid(s);

		System.out.println(b);
	}

	public static boolean isValid(String s) {
		//�N���w�r�Ŵ��N���ŭ�
		while(true){
			
			String temp=s.replace("[]","").replace("{}","").replace("()", "");
			
			if(temp.length() < s.length()) {
				
				s = temp;//��r�Ŧ�L�k�A�Y���(�Ŧr�Ŧ�)�פ�`��
			} else {
				
				break; 
			}
		}
		return s.isEmpty();
	}

}
