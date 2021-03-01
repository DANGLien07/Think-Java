package chap8;

public class bt12_CaptainCrunch {
	public static void main(String[]args){
		testChinh();
	}

	public static void testPhu() {
		System.out.println(Phu('a')=='n'); 
		System.out.println(Phu('b')=='o');
		System.out.println(Phu('z')=='m');
		System.out.println(Phu('A')=='N');
		System.out.println(Phu('B')=='O');
		System.out.println(Phu('Z')=='M');
		System.out.println(Phu(' ')==' ');
		System.out.println(Phu('@')=='@');
		
	}
	public static void testChinh() {
		System.out.println(Chinh("abz zba")=="nom mon"); 
		System.out.println(Chinh("ABZ ZBA")=="NOM MON"); 
	}

	public static char Phu(char n){
		String x1 = "abcdefghijklmnopqrstuvwxyz";
		String x2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		kiem tra xem n co thuoc x1 hay ko
		if (x1.indexOf(n) != -1) {		
			n = x1.charAt((x1.indexOf(n) + 13)%26);
		} else if ((x2.indexOf(n) != -1)) {
			n = x2.charAt((x2.indexOf(n) + 13)%26);
		} else if (n == ' '){
			
		} else {
			System.out.print("Loi loi loi!!!!!");
		}
		return n;
	}
	public static String Chinh(String s){
		int index = 0;
		String s1="";
		while (index < s.length()) {
			
			
			s1=s1+Phu(s.charAt(index));
			
			
			index ++;
		}	
		System.out.println(s1=="nom mon");
		return s1;
	}

		
	}


