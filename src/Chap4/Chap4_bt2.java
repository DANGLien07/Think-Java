package Chap4;

public class Chap4_bt2 {

		  public static void baffle(String blimp) { 
			
		    System.out.println("day la blimp nha "+ blimp); 
		    zippo("3. ping", -5); 
		  } 

		  public static void zippo(String quince, int flag) { 
		    if (flag < 0) { 
		      System.out.println(quince + " zoop"); 
		    } else { 
		      System.out.println("1.ik"); 
		      baffle(quince); 
		      System.out.println("4. boo-wa-ha-ha"); 
		    } 
		  } 

		  public static void main(String[] args) { 
			String test = "Lien Dang";
		    zippo(test, 13); 
		  } 
		}

