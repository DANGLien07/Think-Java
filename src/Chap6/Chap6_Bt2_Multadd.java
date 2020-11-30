package Chap6;

public class Chap6_Bt2_Multadd {
	public static void main (String []args) {
//		System.out.print ("Đáp số là: " + multadd(1.0, 2.0, 3.0));
//		double x = Math.cos(Math.PI/4);
//		double y = 0.5;
//		double z = Math.sin(Math.PI/4);
//		System.out.print(multadd(x, y, z));
		double x = 10;
		System.out.print(yikes(10));

	
	}
	
	public static double multadd (double a, double b, double c) {
		double tinh = a*b+c;
		return tinh;
	}
	public static double yikes (double x) {
		double n = Math.exp(-x);
		double k = Math.sqrt(1-n);
		double result =  multadd(x, n, k);
		return result;
	}
	    

}
