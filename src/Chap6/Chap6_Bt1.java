package Chap6;

public class Chap6_Bt1 {
	public static void main (String[] args) {
		 int m = 6;
		 int n = 3;
		 System.out.print(m + " chia het cho " + n + " la: " + isDivisible(m,n));
	}
	
	
	public static boolean isDivisible(int n, int m) {
//		if (n%m == 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return n%m == 0;
	}
	
}

