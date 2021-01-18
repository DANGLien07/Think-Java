package chap8;

public class bt9_Palindrome {
	public static void main (String[]args) {
//		System.out.println(first("lien"));
//		System.out.println(last("DANG"));
//		System.out.println(middle("thbn"));
		System.out.println(isPalindrome("lal"));
		
	}
	public static char first(String x) {
		return (x.charAt(0));
	}
	public static char last(String n) {
		return (n.charAt(n.length()-1));
	}
	public static String middle(String k) {
		
		return (k.substring(1,k.length()-1));
	}
	public static boolean isPalindrome(String z) {
		if ((z.length()-1==0) || (z.length()) == 0){
			return true;
		}
		
		if (first(z)!=last(z)){
			return false;
		}
		else {
			return isPalindrome(middle(z));
			}
		}
	}


