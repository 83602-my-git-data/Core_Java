package com.exception;

import java.util.Scanner;

public class StringCheack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :: ");
		String name = sc.next();
		try {
		if(name.length()>20)
			throw new ExceptionLineTooLong("The strings is too long");
		
		System.out.println("Your Name is "+name);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
