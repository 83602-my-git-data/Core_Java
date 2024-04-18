package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.customException.CustomException;
import com.app.pojos.Student;

public interface StudentsUtils {

	public static ArrayList<Student> PopulatedList() throws CustomException {
		ArrayList<Student> list = new ArrayList<>();
		list.add(validatesStudents(3, "vrushab", "Pune", 546, "2023-12-08", list));
		list.add(validatesStudents(1, "rahul", "Mumbai", 646, "2023-11-18", list));
		list.add(validatesStudents(2, "prashant", "Akola", 596, "2023-11-23", list));
		list.add(validatesStudents(5, "pratik", "Dhule", 46, "2023-08-08", list));
		list.add(validatesStudents(4, "onkar", "Nashik", 54, "2023-12-28", list));

		return list;
	}

	static Student validatesStudents(int roll, String name, String city, double mark, String dateOfAdimission,
			ArrayList<Student> Student) throws CustomException {
		if (checkForDuplicates(roll, Student))
			throw new CustomException("Student Roll No is Duplicated..");
		LocalDate d1 = LocalDate.parse(dateOfAdimission);

		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		if (!d1.isBefore(beginYear))
			throw new CustomException("Student adimission date must be after 1st Jan of the curnt year");

		return new Student(roll, name, city, mark, d1);

	}

	static boolean checkForDuplicates(int roll, ArrayList<Student> student) {
		return student.contains(new Student(roll));

	}

}
