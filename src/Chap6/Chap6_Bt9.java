package Chap6;

public class Chap6_Bt9 {
 	public static void main (String [] args) {
	System.out.println (power(4,2));
}
 	public static int power(int x, int n) {
 		if (n == 0) {
			return 1;
 		}
		else {
		  	int result = x * power(x, n-1); 
		  	return result;

		}
 		
 	}
}
