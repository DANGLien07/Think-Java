package Chap6;

public class Recurse {
	public static void main (String [] args) {
		String backwards=reverseString("lien DANG");
		System.out.println(backwards);
	}

	// first: trả lại kí tự đầu tiên của String cho trước 
	public static char first(String s) { 
		return s.charAt(0); 
	} 

	// last: trả lại một String mới có chứa toàn bộ 
	// chỉ trừ kí tự đầu của String cho trước 
	public static String rest(String s) { 
		return s.substring(1, s.length()); 
	} 

	// length: trả lại chiều dài của String cho trước 
	public static int length(String s) { 
		return s.length(); 
	} 
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
			return printString(rest(s)); 
		}
	}

	// In các ký tự của String từ cuối về đầu  
	// last: trả lại kí tự cuối cùng của String cho trước 
	public static char last(String s) { 
		return s.charAt(s.length()-1); 
	} 
	// last: trả lại một String mới có chứa toàn bộ trừ ký tự cuối 
	public static String rest2(String s) { 
		return s.substring(0, s.length()-1); 
	} 
	// length: trả lại chiều dài của String cho trước 
	public static int length2(String s) { 
		return s.length(); 
	}
	public static char printBackward(String s) {
		if (length2(s)==0) {
			System.out.println ("Nhập vào tối thiểu một ký tự!");
			return 0;
		}
		System.out.print(last(s));

		if (length2(s)==1) {
			return 0;
		}
		else {
			return printBackward(rest2(s)); 
		}
	}

	//Trả về chuỗi với các ký tự ngược lại với chuỗi truyền vào
	public static String reverseString(String s) {
		if (length2(s)==1) {
			return s;
		}
		char x = last(s);
		String y = rest2(s);	                   
		String z = x + reverseString(y);	  
		return z; 
	}
}

