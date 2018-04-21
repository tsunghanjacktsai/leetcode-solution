package math;

public class AddBinary {

	public static void main(String[] args) {
		String a = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String b = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String sum = addBinary(a, b);
		System.out.println(sum);
	}
	
	public static String addBinary(String a, String b) {
		//��l�Ʈe��
		StringBuilder builder = new StringBuilder();
		//�ѫ᩹�e�M��
		int x = a.length() - 1;
		int y = b.length() - 1;
		//��l���ܶq�s��i��
		int carry = 0;
		while(x >= 0 || y >= 0 || carry == 1) {
			int digit_1 = x < 0 ? 0 : a.charAt(x--) - '0';
			int digit_2 = y < 0 ? 0 : b.charAt(y--) - '0';
			builder.insert(0, (digit_1 + digit_2 + carry) % 2);
			carry = (digit_1 + digit_2 + carry) / 2;
		}
		return builder.toString();
	}

}
