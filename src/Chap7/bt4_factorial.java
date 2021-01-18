package Chap7;

public class bt4_factorial {
	public static void main (String []args) {
		
		System.out.print(factorial(5));
	}
	public static int factorial(int n) {
	
		if (n==0) {
			return 1;
		}
		int temp = 1;
		int result = 1;
		while (temp<n){
			temp = temp+1;
			result = temp*result;
			//System.out.println(result);
		}

	return result;
	
	}
}
