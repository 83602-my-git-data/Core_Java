package com.app;

import java.util.Scanner;

public class SalariedEmployee extends Employee  {

	private double weeklySalary;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter the Salary ::");
		this.setWeeklySalary(sc.nextDouble());
		
		
	}

	@Override
	public void CalculateSalary() {
		System.out.println("Monthly salary is "+(this.getWeeklySalary()*4));
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee ["+super.toString() +"weeklySalary=" + weeklySalary + "]";
	}

	
	
}
