package dynamicprogramming;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		int result = climbStairs_2(44);
		System.out.println(result);
	}
	
	public static int climbStairs(int n) {
		if(n < 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 2;
		}
		int x = 1;
		int y = 2;
		int z = 0;
		while(n-- > 2) {
			z = x + y;
			x = y;
			y = z;
		}
		return z;
	}
	
	public static int climbStairs_2(int n) {
	    if(n < 0)
	        return 0;
	    if(n == 1)
	        return 1;
	        
	    int[] store = new int[n];
	    
	    store[0] = 1;
	    store[1] = 2;
	    
	    for(int i = 2; i < n; ++i)
	        store[i] = store[i-1] + store[i-2];
	        
	    return store[n-1];
	}
}
