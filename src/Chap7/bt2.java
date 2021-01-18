package Chap7;

public class bt2 {
	public static void main (String [] args) {
		double a = -9;
		//System.out.print(squareroot(a)*squareroot(a));
		System.out.print(squareroot(a));
	}
	public static double squareroot (double a) {
		double x = a/2;
		double temp = x; // lưu kết quả trước đó
		x = (x + a/x)/2;
		while (Math.abs(x-temp) > 0.0001) {
			temp = x;
			x = (x + a/x)/2;
		}
		return x;
	}

}
