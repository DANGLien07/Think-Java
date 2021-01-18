package chap8;

public class bt1 {
	public static void main (String []args) {
		String chuoi = "lien";
		int index = chuoi.length()-1;
		while (index >= 0) {
		System.out.print(chuoi.charAt(index));
//		System.out.println(index);
//		index = index - 1;
		index--;
	}
	}
}
