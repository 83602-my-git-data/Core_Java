package com.app;

import java.util.Scanner;

public class BasePlusComissionEmployee extends ComissionEmployee {
     private double baseSalary;
     
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter the Base Salary :: ");
		this.setBaseSalary(sc.nextDouble());
	}

	@Override
	public void CalculateSalary() {
		System.out.println("total Salary is ::"+(this.getBaseSalary()+(this.getCommissionRates()*this.getGrossSales())));
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusComissionEmployee ["+super.toString()+" baseSalary=" + baseSalary + "]";
	}

	
}
