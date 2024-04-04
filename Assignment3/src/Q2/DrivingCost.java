package Q2;

import java.util.Scanner;

public class DrivingCost {
	private double totalMiles;// 100
	private double costPerGallon;// 10
	private double milesPerGallon;// 10
	private double parkingFees;// 500
	private double tolls;// 500

	// 500+500+100*10*10

	public DrivingCost(double totalMiles, double costPerGallon, double milesPerGallon, double parkingFees,
			double tolls) {
		this.totalMiles = totalMiles;
		this.costPerGallon = costPerGallon;
		this.milesPerGallon = milesPerGallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}

	public double dailyDrivingCost() {
		return parkingFees + tolls + (totalMiles / milesPerGallon * costPerGallon);
	}
	
	
	
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
       // Input information
       System.out.print("Enter total miles driven per day: ");
       double totalMiles = sc.nextDouble();

       System.out.print("Enter cost per gallon of gasoline: $");
       double costPerGallon = sc.nextDouble();

       System.out.print("Enter average miles per gallon: ");
       double milesPerGallon = sc.nextDouble();

       System.out.print("Enter parking fees per day: $");
       double parkingFees = sc.nextDouble();

       System.out.print("Enter tolls per day: $");
       double tolls = sc.nextDouble();
       
       DrivingCost dc = new DrivingCost(totalMiles, costPerGallon, milesPerGallon, parkingFees, tolls);

       System.out.println("\nYour daily driving cost is: $" +dc.dailyDrivingCost());
       
}
}
