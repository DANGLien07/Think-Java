package chap8;

public class bt4 {

	public static void main (String[]args) {
		System.out.print(check("(((((3 + 7) * 2)))}", "()"));
	}
	public static int check(String s, String sample) {
		int len = s.length(); 
		int i = 0; 
		int count = 0;
		char start=sample.charAt(0);
		char end = sample.charAt(1);
		char c = 'a';
		while (i < len) { 
			c = s.charAt(i); 
			if (c == start) { 
				count++; 
			} else if (c == end) { 
				count--; 
			} 
			i++; 
		} 
		return count;
	}	 
}
