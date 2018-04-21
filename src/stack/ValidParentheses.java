package stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "[()]";
		boolean b = isValid(s);

		System.out.println(b);
	}

	public static boolean isValid(String s) {
		while(true){
			
			String temp=s.replace("[]","").replace("{}","").replace("()", "");
			
			if(temp.length() < s.length()) {
				
				s = temp;
			} else {
				
				break; 
			}
		}
		return s.isEmpty();
	}

}
