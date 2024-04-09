package com.app;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
		private double wages;
		private int hrs;
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter the Wages ::");
		this.setWages(sc.nextDouble());
		System.out.println("Enter the hrs ::");
		this.setHrs(sc.nextInt());

	}


	@Override
	public void CalculateSalary() {
		if(this.getHrs() <= 40)
		System.out.println(" Total Salary is :: "+this.getWages()* this.getHrs());
		else 
			System.out.println(" Total Salary is :: "+((40 * this.getWages())+(this.getHrs()-40)*this.getWages()*1.5));	
	}


	public double getWages() {
		return wages;
	}


	public void setWages(double wages) {
		this.wages = wages;
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	@Override
	public String toString() {
		return "HourlyEmployee ["+ super.toString()+ "wages= " + this.getWages() + ", hrs= " + this.hrs + "]";
	}

	
}
