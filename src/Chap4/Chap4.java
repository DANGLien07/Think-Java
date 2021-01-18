package Chap4;

public class Chap4 {
	public static void main(String[] args){
	//	printParity(17);
	//	printLogarithm(-20);
	countdown(11);
	
		//Thực hiện theo điều kiện
		/* 
	}
	  public static void printParity(int x) { 
		    if (x%2 == 0) { 
		      System.out.println("x la so chan"); 
		    } else { 
		      System.out.println("x la so le"); 
		    } 
		  } 
		  
		// Gói đoạn mã lệnh vào 1 phương thức
	}
	public static void printParity(int x) { 
	    if (x%2 == 0) { 
	      System.out.println("x la so chan"); 
	    } else { 
	      System.out.println("x la so le"); 
	    } 
		
		//Điều kiện xâu chuỗi
	}
		public static void printParity(int x) {
		 if (x > 0) { 
		      System.out.println("x la so duong"); 
		    } else if (x < 0) { 
		      System.out.println("x la so am"); 
		    } else { 
		      System.out.println("x bang khong"); 
		    }
		
		//Điều kiện lồng ghép
	}
	public static void printParity(int x) {
		 if (x == 0) { 
		      System.out.println("x bang khong"); 
		    } else { 
		      if (x > 0) { 
		        System.out.println("x la so duong"); 
		      } else { 
		        System.out.println("x la so am"); 
		      } 
		    }
		
		//Câu lệnh return
	}
	public static void printParity(int x) {
		
	}
		  public static void printLogarithm(double x) { 
			    if (x <= 0.0) { 
			      System.out.println("Yêu cau nhap vao so duong."); 
			      return; 
			    } 
			    double result = Math.log(x); 
			    System.out.println("Gia tri log cua x bang " + result); 
			  }  */
	}
		public static void countdown(int n) { 
		    if (n == 0) { 
		      System.out.println("Bum!"); 
		    } else { 
		      System.out.println(n); 
		      countdown(n-1); 
		    } 
		  }
	  }

