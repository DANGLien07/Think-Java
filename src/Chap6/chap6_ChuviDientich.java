package Chap6;

public class chap6_ChuviDientich {
	public static void main (String[] args) {

//		double dist = dientich(1.0, 2.0, 4.0, 6.0);
		System.out.println("Dien tich hinh tron la " + dientich(3) + " " + dientich(1.0, 2.0, 4.0, 6.0));
		
//		dientich(3);
//		dientich(1.0, 2.0, 4.0, 6.0);
		
	}

	public static double dientich(double tx1, double ty1, double tx2, double ty2) {
		double kc = distance(tx1, ty1, tx2, ty2);
		return dientich(kc);
	}
	public static double dientich(double x) {
		return Math.PI * x * x;
	}
	
	public static double distance (double x1, double y1, double x2, double y2) { 
		    double dx = x2 - x1; 
		    double dy = y2 - y1; 
		    double binhphuong = dx*dx + dy*dy;
		    double khoangcach =  Math.sqrt(binhphuong);
		    return khoangcach;
	  }
}
