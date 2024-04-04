package Q2.com.app.geometry.tester;
import java.util.Scanner;
import Q2.com.app.geometry.Point2D;

public class PointTester {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the X And Y Co-Ordinates for Point P1 ::");
		 Point2D  p1 = new Point2D(sc.nextInt(),sc.nextInt());
		 
		 System.out.println("Point P1 :: "+p1.toString());
		System.out.println();
		System.out.println("Enter the X Co-Ordinates for Point P2 ::");
		 x = sc.nextInt();
		System.out.println("Enter the Y Co-Ordinates for Point P2 ::");
		 y = sc.nextInt(); 
		 Point2D  p2 = new Point2D(x,y);
         System.out.println("Point P2 :: "+p2.toString());
         System.out.println();
         if(p1.equals(p2))
        	   System.out.println("P1 & P2 are located at the same position..");
         else
        	 	System.out.println("Distance Between P1 and P2 is "+p1.calculateDistance(p2));
	}

}
