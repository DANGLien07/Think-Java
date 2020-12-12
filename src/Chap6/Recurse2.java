package Chap6;

public class Recurse2 {
	public static void main (String []args) {
		//		String test=reverseString("lien DANG");
		printString (reverseString("lien DANG"));
	}

	//first: trả lại kí tự đầu tiên của String cho trước 
	public static char first(String s) { 
		return s.charAt(0); 
	} 
	// last: trả lại kí tự cuối cùng của String cho trước 
	public static char last(String s) { 
		return s.charAt(s.length()-1); 
	} 

	// rest: trả lại một String mới có chứa toàn bộ trừ ký tự cuối cùng 
	public static String rest(String s) { 
		return s.substring(0, s.length()-1); 
	}

	// rest2: trả lại một String mới có chứa toàn bộ ký tự chỉ trừ kí tự đầu của String cho trước 
	public static String rest2(String s) { 
		return s.substring(1, s.length()); 
	} 

	// length: trả lại chiều dài của String cho trước 
	public static int length(String s) { 
		return s.length(); 
	}
	//Trả về chuỗi với các ký tự ngược lại với chuỗi truyền vào
	public static String reverseString(String s) {
		if (length(s)==1) {
			return s;
		}
		char x = last(s);
		String y = rest(s);	                   
		String z = x + reverseString(y);	  
		return z; 
	}
	//In ra các chữ cái trong string mỗi chữ cái 1 dòng theo chiều xuôi
	public static char printString(String s) {
		if (length(s)==0) {
			System.out.println ("Toi thieu mot ky tu!!!");
			return 0;
		}

		System.out.println (first(s));
		if (length(s)==1) {
			return 0;
		}
		else {
			return printString(rest2(s)); 
		}
	}
}
