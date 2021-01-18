package Chap3;

public class chap3_bt4 {
	public static void main (String[] args) {
		printAmerican ("Monday", "November", 01, 2020);
		printEuropean ("Monday", 01, "November", 2020);
	}
	public static void printAmerican (String thu, String thang, int ngay, int nam) {
		System.out.println(thu + ", " + thang + " " + ngay + ", " + nam);	
	}
	public static void printEuropean (String thu, int ngay, String thang, int nam) {
		System.out.println(thu + ", " + ngay + " " + thang + " " + nam);
	}
}
