package com.app.tester;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.dao.StudentDao;
import com.app.entity.Student;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(StudentDao std = new StudentDao();
		Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter the name , marks , mobile no ");
//			std.insertStudent(new Student(sc.next(), sc.nextDouble(),sc.nextLine()));
			
			std.allStudent().forEach(System.out::println);
			std.deleteStudentById(8);
			System.out.println(std.studentById(1));
			
				
		} catch (SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
