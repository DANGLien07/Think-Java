package chap8;

public class b10_Abecedarian {

	public static void main (String []args) {
		System.out.print(Chinh("ab"));

	}
	public static boolean Phu(char x1, char x2) {
		String x = "abcdefghijklmnopqrstuvwxyz";
		int index1 = x.indexOf(x1);
		int index2 = x.indexOf(x2);
		if (index1 == index2){
			return true;
		}
		else 
			return false;
	}
	public static boolean Chinh(String z) {
		int index = 0;
		while (index < z.length()-2) {
			char x1 = z.charAt(index);
			char x2 = z.charAt(index+1);
			if (Phu(x1, x2)==true){
				index = index +2;
			}
			else{
				return false;
			}
		}
		return true;
	}

}
