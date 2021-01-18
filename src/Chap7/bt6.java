package Chap7;

public class bt6 {
	public static void main (String []args) {
		unittest();
	}
	
	public static void unittest() {
		double x = 3.3;
		int n = mygauss(x, 0.0001);
		System.out.println(gauss(x,n));
		System.out.println(Math.exp(-x*x));
	}
	
	public static double gauss (double x, int n) {
		int count = 1;
		double temp = 1.0;
		double result = 1.0;
		while (count < n) {
			
			temp = (temp * (-(x*x)))/count;
			//System.out.println(temp);
			result = temp + result;
			count = count + 1;
		}
	return result;	
	}

	public static int mygauss (double x, double error) {
		int count = 1;
		double temp = 1.0;
//		double result = 1.0;
		while (Math.abs(temp) > error*error) {
			temp = (temp * (-(x*x)))/count;
//			result = temp + result;
			count = count + 1;
		}
	return count;	
	}

}
