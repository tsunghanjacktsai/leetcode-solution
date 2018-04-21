package binarysearch;

public class SquareRoot {

	public static void main(String[] args) {
	    for ( int i = 0; i <= 10; i++ ) {  
	        System.out.println(i + " : " + mySqrt(i));  
	    } 		
	}
	
	public static int mySqrt(int x) {
		if(x < 4) {
			return x==0 ? 0 : 1;
		}
		int result = 2 * mySqrt(x / 4);
		if((result + 1) * (result + 1) <= x && (result + 1) * (result + 1) >= 0) {
			return result + 1;
		}
		return result;
	}
}
