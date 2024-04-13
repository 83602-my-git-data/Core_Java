package com.app;

import java.util.*;

public class Q2 {

	public static void Menu() {
		System.out.println("0. Exits\r\n" + "1. sorted on their city (asc)\r\n"
				+ "2. sorted on their on marks (desc)\r\n" + "3. sorted on their on name (asc)");
		System.out.println("Enter the choice :: ");
	}

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "vrushab", "Pune", 546);
		arr[1] = new Student(1, "rahul", "Mumbai", 646);
		arr[2] = new Student(2, "prashant", "Akola", 596);
		arr[3] = new Student(5, "pratik", "Dhule", 46);
		arr[4] = new Student(4, "onkar", "Nashik", 54);
		int choice = 0;

		do {
			Menu();
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 0:
				System.out.println("End---------------------");
				break;
			case 1: {
				System.out.println("Before Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getCity().compareTo(o2.getCity());
					}
				});

				System.out.println("After Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;
			case 2: {
				System.out.println("Before Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.getMarks(), o1.getMarks());
					}
				});

				System.out.println("After Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;
			case 3: {
				System.out.println("Before Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});

				System.out.println("After Sorting -");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 0);
	}

}
