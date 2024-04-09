package com.app.tester;

import java.util.Scanner;

import com.app.*;

public class EmployeeTaster {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********for Salaried Employee**********");
		Employee emp = new SalariedEmployee();
		emp.acceptEmployee(sc);
	   System.out.println(emp.toString());
		emp.CalculateSalary();
		
		System.out.println("**********for Hourly Employee**********");
		Employee emp1 = new HourlyEmployee();
		emp1.acceptEmployee(sc);
	   System.out.println(emp1.toString());
		emp1.CalculateSalary();
		
		System.out.println("**********for Commission Employee**********");
		Employee emp2 = new ComissionEmployee();
		emp2.acceptEmployee(sc);
	   System.out.println(emp2.toString());
		emp2.CalculateSalary();
		
		System.out.println("**********for Base Plus Commission Employee**********");
		Employee emp3 = new BasePlusComissionEmployee();
		emp3.acceptEmployee(sc);
	   System.out.println(emp3.toString());
		emp3.CalculateSalary();
		
		BasePlusComissionEmployee bpce = (BasePlusComissionEmployee) emp3;
		
		System.out.println("After the Reward :: "+((bpce.getBaseSalary()+(bpce.getCommissionRates()*bpce.getGrossSales()))*1.10));

	}

}
