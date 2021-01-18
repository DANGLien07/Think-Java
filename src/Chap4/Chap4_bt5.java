package Chap4;

public class Chap4_bt5 {
	public static void main (String[] args) {
		check_fermat(3,4,5,7);
	}

	public static void check_fermat (int a, int b, int c, int n) {
		if (n > 2) {
			if (raiseToPow(a, n) + raiseToPow(b, n) == raiseToPow(c, n)) {
				System.out.println ("Troi fermat da nham!");
			}	
			else {
				System.out.print("Khong, fermat van dung!");
			}
				
		}
	}
	
	public static int raiseToPow(int t, int m) {
//		Tính t mũ n
		double x = Math.pow((double)t, (double) m);
		return (int)x;
	}
}
