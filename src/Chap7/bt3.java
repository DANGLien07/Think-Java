package Chap7;

public class bt3 {
	public static void main (String []args) {
		System.out.print(power(3,1));
	}
	public static double power (double x, int n) {
		double temp=x;
		while (n > 1) {
			n = n-1;
			x= x*temp;
		}
		return x;
	}

}
