package chap8;

public class bt10_Abecedarian_dequy {
	public static void main (String []args) {
		System.out.print(unittest());

	}
	
	public static int unittest() {
		int count = 0;
		if (Chinh("abdest")==true) {
			count++;
		}
		if (Chinh("ba")==false) {
			count++;
		}
		if (Chinh("liendang")==false) {
			count++;
		}
		if (Chinh("behint")==true) {
			count++;
		}
		return count;
	}
	
	public static boolean Phu(char x1, char x2) {
		String x = "abcdefghijklmnopqrstuvwxyz";
		int index1 = x.indexOf(x1);
		int index2 = x.indexOf(x2);
		if (index1 <= index2){
			return true;
		}
		else 
			return false;
	}
	public static boolean Chinh(String z) {
		if (z.length()==2) {
			char x1 = z.charAt(0);
			char x2 = z.charAt(1);
			return Phu(x1,x2);	
		}
		
		String sub = z.substring(1, z.length());
		if (Chinh(sub) == false) {
			return false;
		} else {
			char x1 = z.charAt(0);
			char x2 = sub.charAt(0);
			return Phu(x1,x2);
		}
	}
}

