package Q2;

import java.util.Scanner;
public class ARS {

	private boolean seat[] = new boolean[10];
	private int indexForFirstClass = 0;
	private int indexForEconomyClass = 5;

	public boolean isFirstClassOccupied() {
		if (indexForFirstClass < 5) {
			seat[indexForFirstClass++] = true;
			return true;
		} else
			return false;
	}

	public boolean isEconomyClassOccupied() {
		if (indexForEconomyClass < 10) {
			seat[indexForEconomyClass++] = true;
			return true;
		} else
			return false;
	}

	public int getIndexForFirstClass() {
		return indexForFirstClass;
	}

	public void setIndexForFirstClass(int indexForFirstClass) {
		this.indexForFirstClass = indexForFirstClass;
	}

	public int getIndexForEconomyClass() {
		return indexForEconomyClass;
	}

	public void setIndexForEconomyClass(int indexForEconomyClass) {
		this.indexForEconomyClass = indexForEconomyClass;
	}

	public boolean[] getSeat() {
		return seat;
	}

	private static void menu() {
		System.out.println("*******************************************************");
		System.out.println("1. For First Calss Booking..");
		System.out.println("2. For Second Calss Booking..");
		System.out.println("0. Exits");
		System.out.println("Enter your choice - ");
		System.out.println("********************************************************");
	}

	public static void main(String[] args) {

		ARS ars = new ARS();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You!!!");
				break;
			case 1: {
				if (ars.isFirstClassOccupied())
					System.out.println("your seat number in First Class is " + ars.getIndexForFirstClass());
				else
					System.out.println("First Class Is Fulled..");

			}
				break;
			case 2: {
				if (ars.isEconomyClassOccupied())
					System.out.println("your seat number in Economy Class is " + ars.getIndexForEconomyClass());
				else
					System.out.println("Economy Class Is Fulled..");

			}
				break;
			default:
				System.out.println("Invalid Choice !!!!1");
				break;
			}
		} while (choice != 0);

	}

}
