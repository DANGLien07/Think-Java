package Chap2;

public class Chap2 {
	public static void main (String[] args){
		
		//Khai báo biến
				String firstName;
				String lastName;
	            int hour, minute;
	            
	    //Gán giá trị cho biến
	            firstName = "Liên";
	            lastName = "DANG";
	            hour = 15;
	            minute = 59;
	            
	     //In các biến
	            System.out.print("Tên tôi là: ");
	            System.out.print(firstName);
	            System.out.println(lastName);
	            
	      //Thời gian 
	            System.out.print("Bây giờ là: ");
	            System.out.print(hour);
	            System.out.print(" giờ ");
	            System.out.print(minute);
	            System.out.println(" phút");
	            
	      //Số phút tính từ nửa đêm
	            System.out.print("Number of minutes since midnight: ");
	            System.out.println(hour*60 + minute);
	       
	      //Số phút còn lại đến hết ngày 
	            System.out.print("Fraction of the hour that has passed: "); 
	            System.out.println(minute/60);
	            
	      //Phần trăm thời gian đã qua
	            System.out.print("Percentage of the hour that has passed: "); 
	            int percentage; 
	            percentage = (minute * 100) / 60;
	            System.out.print(percentage);	
	            System.out.println("%");
	            
	}
}
