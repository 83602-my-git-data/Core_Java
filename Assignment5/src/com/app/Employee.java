package com.app;

import java.util.Scanner;

public abstract class Employee implements acceptable {
   
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	
	//abstract method for the Employee calculate the weekly salary
	public abstract void CalculateSalary();

	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter the First Name ::");
		 this.setFirstName(sc.next());
		System.out.println("Enter the Last Name ::");
		this.setLastName(sc.next());
		System.out.println("Enter the SSN ::");
		this.setSocialSecurityNamber(sc.next());		
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNamber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNamber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + " ";
	}

	
}
