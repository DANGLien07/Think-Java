package Chap6;

public class chap6_Giaithua {
	public static void main(String []arg) {
		int a = 5;
		System.out.println("Giai thừa của " + a + " là: "+ factorial(a));
	}
		     /* Phương thức logic
	 //boolean bigFlag = !isSingleDigit(71);
	}
	public static boolean isSingleDigit(int x) {
	//	if (x >= 0 && x < 10) { 
	//	      return true; 
	//	    } else { 
	//	      return false; 
		return (x >= 0 && x < 10);
		    } 
   */
		// Đệ quy tính giai thừa
		public static int factorial(int n) { 
		  if (n==0) {
			  return 1;
		  }
		  else {
			int recurse = factorial(n-1); 
		  	int result = n * recurse; 
		  	return result; 	
		}
	}
}
