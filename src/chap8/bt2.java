package chap8;

public class bt2 {
	public static void main (String[]args) {
		System.out.print(countLetters("liendanag",'a'));
//		System.out.print("liendanag".indexOf('k'));
	}
	public static int countLetters(String s, char s1) {
//	    int length = s.length(); 
	    int count = 0; 
	    int index = 0; 
	    while (index > -1) { 
	    	index = s.indexOf(s1, index);
	    	if (index != -1) {
	    		count++;
	    		index++;
	}
	}
		return count;
}
}