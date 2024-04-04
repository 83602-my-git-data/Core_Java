package Q1.com.app.geometry.tester;

import java.util.Scanner;
import Q1.com.app.geometry.Point;

public class PointTester {

	private static void menu() {
		System.out.println("*******************************************************");
		System.out.println("1. Accept Points");
		System.out.println("2. Display All Points ");
		System.out.println("3. Display specific Points");
		System.out.println("4. Check the Points are Equal or Distance Between them.");
		System.out.println("0. Exits");
		System.out.println("Enter your choice - ");
		System.out.println("********************************************************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of points to plot from user :: ");
		Point[] points = new Point[sc.nextInt()];
		int choice, index = 0;
		do {
			menu();
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank you!!!");
			}
				break;
			case 1: {
				if (index < points.length) {
					System.out.println("Enter the X And Y Co-Ordinates for Point P1 ::");
					points[index++] = new Point(sc.nextInt(), sc.nextInt());
				} else {
					System.out.println("points Array is Fulled..");
				}
			}
				break;
			case 2: {
				if (index == points.length) {
					for (Point point : points)
						System.out.println(point.toString());
				} else {
					for (int i=0; i<index;i++)
						System.out.println(points[i].toString());
				}
			}
				break;
			case 3: {
				System.out.println("Enter the Index Of Points :: ");
				int id = sc.nextInt();
				if (id < points.length)
					System.out.println(points[id].toString());
				else
					System.out.println("Invalid index , pls retry!!!!");

			}
				break;
			case 4: {
				System.out.println("Enter the 1 Index Of Points :: ");
				int index1 = sc.nextInt();
				System.out.println("Enter the 2 Index Of Points :: ");
				int index2 = sc.nextInt();
				if(index1 != index2) {
				if ((-1 < index1 && index1 < points.length) && (-1 < index2 && index2 < points.length)) {
					if (points[index1].equals(points[index2]))
						System.out.println(points[index1].toString() + " & " + points[index2].toString()
								+ " are located at the same position..");
					else
						System.out.println(
								"Distance Between P1 and P2 is \n " + points[index1].calculateDistance(points[index2]));
				} 
				}
				else
					System.out.println("Invalid index , pls retry!!!!");
			}
				break;
			default:
				System.out.println("Invalid Choice!!!!!");
				break;
			}
		} while (choice != 0);

	}
}
