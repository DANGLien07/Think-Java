package Chap3;

public class Chap3 {
	/*public static void newLine() { 
		System.out.println(""); 
	} 
	public static void threeLine() { 
		newLine(); newLine(); newLine(); 
	} 
	public static void main(String[] args) { 
		System.out.println("First line."); 
		threeLine(); 
		System.out.println("Second line."); 
	} */
	
	public static void zoop() { 
		baffle(); 
		System.out.print("You wugga "); 
		baffle(); 
	} 
	public static void main(String[] args) { 
		System.out.print("No, I "); 
		zoop(); 
		System.out.print("I "); 
		baffle(); 
	} 
	public static void baffle() { 
		System.out.print("wug"); 
		ping(); 
	} 
	public static void ping() { 
		System.out.println("."); 
	}

}

