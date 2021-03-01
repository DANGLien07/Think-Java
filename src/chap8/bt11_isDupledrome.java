package chap8;

public class bt11_isDupledrome{
	public static void main (String []args) {
		System.out.print(isDupledrome("aacc"));
	}
	public static boolean isDupledrome(String x) {
		int index = 0;
		
		while (index < x.length()-1) {
			char x1 = x.charAt(index);
			char x2 = x.charAt(index+1);
			if (x1 == x2){
			index = index + 2;
			} 
			else{
				return false;
			}
			if (index == x.length()-1) {
				return false;
				}
		}
		return true;
	}
}


