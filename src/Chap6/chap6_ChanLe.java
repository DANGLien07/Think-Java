package Chap6;

public class chap6_ChanLe {
	public static void main (String[] args) {	
		System.out.println("So 9 là số chẵn " + chanle(9));
		
		System.out.println("So 10 là số chẵn " + chanle(10));
	}
	
		public static boolean chanle(int x) {
//			Kiem tra chan le
			if (x%2 == 0) {
				return true;
			}
			else {
				return false;

			}
			//System.out.println(x%2);
		}	
}
