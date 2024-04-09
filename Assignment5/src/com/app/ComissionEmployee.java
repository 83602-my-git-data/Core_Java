package com.app;

import java.util.Scanner;

public class ComissionEmployee extends Employee {
   private double grossSales;
   private int commissionRates;
   
	
	@Override
	public void acceptEmployee(Scanner sc) {
      super.acceptEmployee(sc);
      System.out.println("Enter the Gross Sales ::");
      this.setGrossSales(sc.nextDouble());
      System.out.println("Enter the Comission Rates ::");
      this.setCommissionRates(sc.nextInt());
	}


	@Override
	public void CalculateSalary() {
		System.out.println("Total Salary is :: "+(this.getCommissionRates()*this.getGrossSales()));
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public int getCommissionRates() {
		return commissionRates;
	}


	public void setCommissionRates(int commissionRates) {
		this.commissionRates = commissionRates;
	}


	@Override
	public String toString() {
		return "ComissionEmployee ["+super.toString()+" grossSales=" + grossSales + ", commissionRates=" + commissionRates + "]";
	}
	
	

}
