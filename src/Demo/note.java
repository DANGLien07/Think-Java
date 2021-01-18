package Demo;

public class note {
		 
	    /**
	     * main
	     * 
	     * @author viettuts.vn
	     * @param args
	     */
	    public static void main(String[] args) {
	        int a = 5;
	 
	        System.out.println(fibonacci(a));
	    }
	    
	    public static int fibonacci(int n) { 
	        if (n == 0 || n == 1) { 
	          return 1; 
	        } else { 
	          return fibonacci(n-1) + fibonacci(n-2); 
	        } 
	      }
	    }
	

