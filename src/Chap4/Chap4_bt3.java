package Chap4;

public class Chap4_bt3 {
public static void main (String[] args) {
	beer (99);
}
	private static void beer(int i){
		if (i > 0) {
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer, ya� take one down, ya� pass it around.");
		beer(i-1);
		}
		
		else
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya� can�t take one down, ya� can�t pass it around, �cause there are no more bottles of beer on the wall!");
	
	}
	
	
}



